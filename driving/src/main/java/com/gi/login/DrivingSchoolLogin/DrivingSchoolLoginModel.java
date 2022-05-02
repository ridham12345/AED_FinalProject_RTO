/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gi.login.DrivingSchoolLogin;

/**
 *
 * @author KOUSALYAA
 */
public class DrivingSchoolLoginModel {
    int did;
    String id;
    String mobile;
    String password;
    String dname;

    public DrivingSchoolLoginModel() {
    }

    public DrivingSchoolLoginModel(String mob, String upass) {
        this.mobile = mob;
        this.password = upass;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public DrivingSchoolLoginModel(int did, String id, String mobile, String password, String dname) {
        this.did = did;
        this.id = id;
        this.mobile = mobile;
        this.password = password;
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "DrivingSchoolLoginModel{" + "did=" + did + ", id=" + id + ", mobile=" + mobile + ", password=" + password + ", dname=" + dname + '}';
    }
    
}
