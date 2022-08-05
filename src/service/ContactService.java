
package service;

import database.connection.DatabaseConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ContactModel;

public class ContactService {
    Connection connection;

    public ContactService() {
        connection = DatabaseConnection.getInstance().getConnection();
    }
    
    
    public void insertContact(ContactModel contact){
        try {
            String sql = "INSERT INTO contactos(nombre, telefono, carrera, universidad) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, contact.getName());
            ps.setString(2, contact.getPhone());
            ps.setString(3, contact.getDegree());
            ps.setString(4, contact.getUniversity());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void deleteContact(int id){
        try {
            String sql = "DELETE FROM contactos WHERE id_contacto = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public List<ContactModel> getContacts(boolean desc){
        List<ContactModel> contacts = new ArrayList<>();
        try {
            String sql = "SELECT * FROM contactos";
            if(desc)
                sql = "SELECT * FROM contactos ORDER BY id_contacto DESC";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ContactModel cm = new ContactModel();
                cm.setId(rs.getInt("id_contacto"));
                cm.setName(rs.getString("nombre"));
                cm.setPhone(rs.getString("telefono"));
                cm.setDegree(rs.getString("carrera"));
                cm.setUniversity(rs.getString("universidad"));
                contacts.add(cm);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return contacts;
    }
    
    public ContactModel getContact(String nombre){
        ContactModel contact = new ContactModel();
        try {
            String sql = "SELECT * FROM contactos WHERE nombre = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                contact.setId(rs.getInt("id_contacto"));
                contact.setName(rs.getString("nombre"));
                contact.setPhone(rs.getString("telefono"));
                contact.setDegree(rs.getString("carrera"));
                contact.setUniversity(rs.getString("universidad"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return contact;
    }

    public void updateContact(ContactModel contact) {
        try {
            String sql = "UPDATE contactos SET nombre=?, telefono=?, carrera=?, universidad=? WHERE id_contacto = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, contact.getName());
            ps.setString(2, contact.getPhone());
            ps.setString(3, contact.getDegree());
            ps.setString(4, contact.getUniversity());
            ps.setInt(5, contact.getId());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
