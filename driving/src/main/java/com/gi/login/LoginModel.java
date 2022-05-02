/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gi.login;

import javax.swing.JPasswordField;

public class LoginModel {
    int cid;
    String id;
    String mobile;
    String password;
    String name;
    public LoginModel(String mob, String upass) {
        
        
        this.mobile = mob;
        this.password = upass;}

    

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public LoginModel(int cid, String id, String mobile, String password) {
        this.cid = cid;
        this.id = id;
        this.mobile = mobile;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginModel{" + "cid=" + cid + ", id=" + id + ", mobile=" + mobile + ", password=" + password + '}';
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

    public LoginModel(String id, String mobile, String password) {
        super();
        this.id = id;
        this.mobile = mobile;
        this.password = password;
    }

    public LoginModel() {
    }

}
