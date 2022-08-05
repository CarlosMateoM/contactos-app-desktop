package reports;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ContactModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel extends Thread {

    private final File file;
    private final List<ContactModel> contacts;

    public Excel(File file, List<ContactModel> contacts) {
        this.file = file;
        this.contacts = contacts;
    }

    private void writeBook(ContactModel contact, Row row) {
        Cell cell = row.createCell(0);
        cell.setCellValue(contact.getId());
        cell = row.createCell(1);
        cell.setCellValue(contact.getName());
        cell = row.createCell(2);
        cell.setCellValue(contact.getPhone());
        cell = row.createCell(3);
        cell.setCellValue(contact.getDegree());
        cell = row.createCell(4);
        cell.setCellValue(contact.getUniversity());

    }

    @Override
    public void run() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("LISTA DE CONTACTOS");
        
        sheet.setColumnWidth(0, 10 * 256);
        sheet.setColumnWidth(1, 30 * 256);
        sheet.setColumnWidth(2, 25 * 256);
        sheet.setColumnWidth(3, 30 * 256);
        sheet.setColumnWidth(4, 30 * 256);

        int rowCount = 0;

        for (ContactModel contact : contacts) {
            Row row = sheet.createRow(rowCount++);
            writeBook(contact, row);
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            workbook.write(outputStream);
        } catch (IOException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
