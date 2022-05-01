/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AuthorityLogin;

/**
 *
 * @author DELL
 */
public class DrivingSchoolModel {

    int id;
    String name;
    String address;
    String email;
    String yoe;
    String contactno;
    String contactperson;
    boolean Active;
    boolean isActive;

    public DrivingSchoolModel() {
    }

    public DrivingSchoolModel(int id, String name, String address, String email, String yoe, String contactno, String contactperson, boolean active) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.yoe = yoe;
        this.contactno = contactno;
        this.contactperson = contactperson;
        this.Active = active;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public boolean getActive() {
        return Active;
    }

    public void setActive(boolean Active) {
        this.Active = Active;
    }

    public String getYoe() {
        return yoe;
    }

    public String getContactno() {
        return contactno;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setYoe(String yoe) {
        this.yoe = yoe;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    @Override
    public String toString() {
        return "DrivingSchoolModel{" + "id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", yoe=" + yoe + ", contactno=" + contactno + ", contactperson=" + contactperson + ", Active=" + Active + ", isActive=" + isActive + '}';
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    

}
