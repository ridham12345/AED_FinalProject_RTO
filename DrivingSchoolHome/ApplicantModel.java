/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrivingSchoolHome;

/**
 *
 * @author sundermetpalli
 */
public class ApplicantModel {
    
    String Id;
    String customer_name;
    String customer_contact;
    String vehicle;
    String apply_date;
    String status;

    public ApplicantModel() {
    }

    public ApplicantModel(String Id, String customer_name, String customer_contact, String vehicle, String apply_date, String status) {
        this.Id = Id;
        this.customer_name = customer_name;
        this.customer_contact = customer_contact;
        this.vehicle = vehicle;
        this.apply_date = apply_date;
        this.status = status;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_contact() {
        return customer_contact;
    }

    public void setCustomer_contact(String customer_contact) {
        this.customer_contact = customer_contact;
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

    @Override
    public String toString() {
        return "ApplicantModel{" + "Id=" + Id + ", customer_name=" + customer_name + ", customer_contact=" + customer_contact + ", vehicle=" + vehicle + ", apply_date=" + apply_date + ", status=" + status + '}';
    }

    
    
}
