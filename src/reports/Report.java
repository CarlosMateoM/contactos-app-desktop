package reports;

import database.connection.DatabaseConnection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Report extends Thread {

    private final File file;
    private final Connection connection;

    public Report(File file) {
        this.file = file;
        connection = DatabaseConnection.getInstance().getConnection();
    }

    @Override
    public void run() {
        String PATH = "report/contacts.jasper";
        JasperPrint jasperPrint;
        try {
            jasperPrint = JasperFillManager.fillReport(PATH, null, connection);
            if (file != null) {
                OutputStream pdf = new FileOutputStream(file);
                JasperExportManager.exportReportToPdfStream(jasperPrint, pdf);
            }
            JasperViewer jviewer = new JasperViewer(jasperPrint, false);
            jviewer.setVisible(true);
        } catch (JRException | FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
