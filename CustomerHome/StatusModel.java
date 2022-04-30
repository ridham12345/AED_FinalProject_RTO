/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerHome;

import AuthorityLogin.AuthorityModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author KOUSALYAA
 */
public class StatusModel {
    
    private boolean isPatient;
    
    
    String Id;
    String driving_school_name;
    String contact_no;
    String vehicle;
    String apply_date;
    String status;

    public String getDriving_school_name() {
        return driving_school_name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    public void setDriving_school_name(String driving_school_name) {
        this.driving_school_name = driving_school_name;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getApply_date() {
        return apply_date;
    }

    public void setApply_date(String apply_date) {
        this.apply_date = apply_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StatusModel() {
    }

    public StatusModel(String Id, String driving_school_name, String contact_no, String vehicle, String apply_date, String status) {
        this.Id = Id;
        this.driving_school_name = driving_school_name;
        this.contact_no = contact_no;
        this.vehicle = vehicle;
        this.apply_date = apply_date;
        this.status = status;
    }

    @Override
    public String toString() {
        return "StatusModel{" + "Id=" + Id + ", driving_school_name=" + driving_school_name + ", contact_no=" + contact_no + ", vehicle=" + vehicle + ", apply_date=" + apply_date + ", status=" + status + '}';
    }

    

    public boolean isIsPatient() {
        return isPatient;
    }

    public void setIsPatient(boolean isPatient) {
        this.isPatient = isPatient;
    }
    
    
}
