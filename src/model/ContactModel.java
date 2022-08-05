
package model;

import swing.table.EventAction;
import swing.table.ModelAction;

public class ContactModel {
    
    private int id;
    private String name;
    private String phone;
    private String degree;
    private String university;

    public ContactModel() {
        id = -1;
        name = "";
        phone = "";
        degree = "";
        university = "";
    }

    public ContactModel(int id, String name, String phone, String degree, String university) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.degree = degree;
        this.university = university;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
    public Object[] toRowTable(EventAction event) {
        String phoneOutput = phone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        return new Object[]{name, phoneOutput, degree, university, new ModelAction(event, this)};
    }
    
}
