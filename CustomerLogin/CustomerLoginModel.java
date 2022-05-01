/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gi.login.CustomerLogin;

public class CustomerLoginModel {
    int cid;
    String id;
    String mobile;
    String password;
    String cname;

    public CustomerLoginModel(String mob, String upass) {
        this.mobile = mob;
        this.password = upass;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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

    
    public CustomerLoginModel() {
    }

    public CustomerLoginModel(int cid, String id, String mobile, String password, String cname) {
        this.cid = cid;
        this.id = id;
        this.mobile = mobile;
        this.password = password;
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "CustomerModel{" + "cid=" + cid + ", id=" + id + ", mobile=" + mobile + ", password=" + password + ", cname=" + cname + '}';
    }
    
}
