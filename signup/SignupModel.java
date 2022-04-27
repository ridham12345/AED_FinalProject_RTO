package com.gi.signup;

//@Entity
//@Table(name = "customer")
public class SignupModel {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "customer_id")
    int id;
    String first_name;
    String last_name;
    String dob;
    String birth_place;
    String email_id;
    String current_address;
    String mobile;
    String password;

    public SignupModel(int id, String first_name, String last_name, String dob, String birth_place, String email_id,
            String current_address, String mobile, String password) {
        super();
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.birth_place = birth_place;
        this.email_id = email_id;
        this.current_address = current_address;
        this.mobile = mobile;
        this.password = password;
    }

    SignupModel(String fname, String lname, String email, String mobile, String address, String birthp, String password, String DOB) {
        this.first_name = fname;
        this.last_name = lname;
        this.dob = DOB;
        this.birth_place = birthp;
        this.email_id = email;
        this.current_address = address;
        this.mobile = mobile;
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SignupModel [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", dob=" + dob
                + ", birth_place=" + birth_place + ", email_id=" + email_id + ", current_address=" + current_address
                + ", mobile=" + mobile + ", password=" + password + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBirth_place() {
        return birth_place;
    }

    public void setBirth_place(String birth_place) {
        this.birth_place = birth_place;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getCurrent_address() {
        return current_address;
    }

    public void setCurrent_address(String current_address) {
        this.current_address = current_address;
    }

    public SignupModel(int id, String first_name, String last_name, String dob, String birth_place, String email_id,
            String current_address) {
        super();
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.birth_place = birth_place;
        this.email_id = email_id;
        this.current_address = current_address;
    }

   

}
