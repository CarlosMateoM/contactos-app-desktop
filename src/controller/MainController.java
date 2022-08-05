package controller;

import components.Message;
import forms.Dashboard;
import forms.NewContactForm;
import forms.ViewContactForm;
import java.awt.Component;
import java.awt.FileDialog;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.EmptyStackException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import main.View;
import model.ContactModel;
import reports.Excel;
import reports.Report;
import service.ContactService;
import swing.table.EventAction;

public class MainController {

    private final View view;
    private final ContactService contactService;
    private boolean isToInsert = true;
    private int id_contact;
    private DefaultTableModel table;

    private final JPanel formLoader;
    private final Dashboard dashboard;
    private final NewContactForm contactForm;
    private final ViewContactForm viewContact;
    private final EventAction eventAction = new EventAction() {
        @Override
        public void delete(ContactModel contact) {
            if (dashboard.getTable().isEditing()) {
                dashboard.getTable().getCellEditor().stopCellEditing();
            }
            if (showMessage("¿Desea borrar el registro con id " + contact.getId() + "?")) {
                contactService.deleteContact(contact.getId());
                showMessage("¡Registro borrado!");
                uploadTable();
            } else {
                showMessage("¡Operacion cancelada!");
            }
        }

        @Override
        public void update(ContactModel contact) {
            if (dashboard.getTable().isEditing()) {
                dashboard.getTable().getCellEditor().stopCellEditing();
            }
            cargarDatos(contact);
            isToInsert = false;
            uploadForm(2);
        }

        @Override
        public void view(ContactModel contact) {
            if (dashboard.getTable().isEditing()) {
                dashboard.getTable().getCellEditor().stopCellEditing();
            }
            viewContact.loadData(contact);
            uploadForm(3);
        }
    };

    public MainController(View view, ContactService contactService) {
        this.view = view;
        this.contactService = contactService;
        dashboard = new Dashboard();
        contactForm = new NewContactForm();
        viewContact = new ViewContactForm();
        formLoader = view.getFormLoader();
        initController();
        initView();
    }

    private void initController() {
        dashboard.getRegistrarBtn().addActionListener(e -> {
            isToInsert = true;
            uploadForm(2);
        });
        contactForm.getRegresarBtn().addActionListener(e -> {
            uploadForm(1);
        });
        contactForm.getGuardarBtn().addActionListener(e -> newProduct());

        viewContact.getAceptarBtn().addActionListener(e -> {
            uploadForm(1);
        });

        dashboard.getPdfBtn().addActionListener(e -> generarPDF());
        dashboard.getExcelBtn().addActionListener(e -> generarExcel());

        dashboard.getBuscarBtn().addActionListener(e -> buscarProducto());
        dashboard.getActualizarBtn().addActionListener(e -> uploadTable());

        cargarCheks();
        contactForm.getRedireccionarCheck().addActionListener(e -> {
            boolean is = contactForm.getRedireccionarCheck().isSelected();
            String value = String.valueOf(is);
            configurations.Config.setPropertyValue("redireccionar", value);
        });

        contactForm.getLimpiarCheck().addActionListener(e -> {
            boolean is = contactForm.getRedireccionarCheck().isSelected();
            String value = String.valueOf(is);
            configurations.Config.setPropertyValue("limpiarCampos", value);
        });
    }

    private void initView() {
        view.setVisible(true);
        table = (DefaultTableModel) dashboard.getTable().getModel();
        uploadForm(1);
        uploadTable();

    }

    private void cargarCheks() {
        String redir = configurations.Config.getPropertyValue("redireccionar");
        contactForm.getRedireccionarCheck().setSelected(Boolean.parseBoolean(redir));
        String campos = configurations.Config.getPropertyValue("limpiarCampos");
        contactForm.getLimpiarCheck().setSelected(Boolean.parseBoolean(campos));
        String inverOrden = configurations.Config.getPropertyValue("invertirOrden");
        dashboard.getInvertirOrdenCheck().setSelected(Boolean.parseBoolean(inverOrden));
    }

    public void uploadTable() {
        limpiarTabla();
        List<ContactModel> list = contactService.getContacts(dashboard.getInvertirOrdenCheck().isSelected());

        dashboard.getTotalContacts().setText("" + list.size());
        dashboard.getBuscarInput().clearItemSuggestion();

        for (ContactModel contact : list) {
            dashboard.getBuscarInput().addItemSuggestion(contact.getName());
            table.addRow(contact.toRowTable(eventAction));
        }
    }

    public void uploadForm(int index) {
        Component com = getFormToUpload(index);
        formLoader.removeAll();
        formLoader.add(com);
        formLoader.revalidate();
        formLoader.repaint();
    }

    private Component getFormToUpload(int index) {
        Component com = null;
        switch (index) {
            case 1:
                com = dashboard;
                setTitleText("/ Dashboard");
                break;
            case 2:
                com = contactForm;
                setTitleText("/ Dashboard / Nuevo Contacto");
                break;
            case 3:
                com = viewContact;
                setTitleText("/ Dashboard / Detalles Del Contacto");
                break;
        }
        return com;
    }

    private void setTitleText(String text) {
        view.getWindowTitleBar().setTitleBarText(text);
    }

    private boolean showMessage(String text) {
        Message message = new Message(text);
        return message.isOk();
    }

    private void newProduct() {
        String nombre = contactForm.getNombreInput().getText();
        String telefono = contactForm.getTelefonoInput().getText();
        String carrera = contactForm.getCarreraInput().getText();
        String universidad = contactForm.getUniversidadInput().getText();

        if (validarFormulario(nombre, telefono, carrera, universidad)) {
            if (isToInsert) {
                ContactModel contact = new ContactModel(-1, nombre, telefono, carrera, universidad);
                contactService.insertContact(contact);
            } else {
                ContactModel contact = new ContactModel(id_contact, nombre, telefono, carrera, universidad);
                contactService.updateContact(contact);
            }
            if (contactForm.getLimpiarCheck().isSelected()) {
                limpiarFormulario();
            }

            showMessage("¡Operacion exitosa!");

            if (contactForm.getRedireccionarCheck().isSelected()) {
                uploadForm(1);
            }
            uploadTable();
        }

    }

    private void limpiarFormulario() {
        contactForm.getNombreInput().setText("");
        contactForm.getTelefonoInput().setText("");
        contactForm.getCarreraInput().setText("");
        contactForm.getUniversidadInput().setText("");
    }

    private boolean validarFormulario(String... strings) {
        boolean valido = true;
        for (String string : strings) {
            if (string.trim().isEmpty()) {
                showMessage("¡Campos vacios!\n¡LLene todos los campos!");
                valido = false;
                break;
            }
        }
        return valido;
    }

    private void buscarProducto() {
        String text = dashboard.getBuscarInput().getText();
        if (validarFormulario(text)) {
            ContactModel contact = contactService.getContact(text);
            if (contact.getId() != -1) {
                limpiarTabla();
                dashboard.getTable().addRow(contact.toRowTable(eventAction));
            } else {
                showMessage("¡Contacto no registrado!");
            }
        }
    }

    private void limpiarTabla() {
        table.setRowCount(0);
    }

    private void cargarDatos(ContactModel contact) {
        id_contact = contact.getId();
        contactForm.getNombreInput().setText(contact.getName());
        contactForm.getTelefonoInput().setText(contact.getPhone());
        contactForm.getCarreraInput().setText(contact.getDegree());
        contactForm.getUniversidadInput().setText(contact.getUniversity());

    }

    private void generarPDF() {
        try {

            File pdf;
            pdf = getReportFile("Guardar PDF", "pdf");
            Report report = new Report(pdf);
            report.start();

        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void generarExcel() {
        try {

            Excel excel;
            List<ContactModel> contacts = contactService.getContacts(false);
            File file = getReportFile("Exportar Excel", "xls");
            if (file != null) {
                excel = new Excel(file, contacts);
                excel.start();
            }

        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private File getReportFile(String title, String ext) throws IOException {

        File file = null;
        java.awt.FileDialog jfc = new java.awt.FileDialog(view, title);
        jfc.setFilenameFilter(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(ext);
            }
        });

        jfc.setMode(FileDialog.SAVE);
        jfc.setVisible(true);

        String path = jfc.getDirectory() + jfc.getFile();

        if(path.equals("nullnull")){
            return null;
        }
        
        file = new File(path);

        if (!path.endsWith(ext)) {

            file = new File(path + "." + ext);
        }

        if (!file.exists()) {
            file.createNewFile();
        }

        return file;
    }

}
