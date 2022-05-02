/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gi.login.AuthorityLogin;

/**
 *
 * @author KOUSALYAA
 */
public class AuthorityLoginModel {

    int aid;
    String id;
    String mobile;
    String password;
    String aname;

    public AuthorityLoginModel() {
    }

    public AuthorityLoginModel(int aid, String id, String mobile, String password, String aname) {
        this.aid = aid;
        this.id = id;
        this.mobile = mobile;
        this.password = password;
        this.aname = aname;
    }

    public AuthorityLoginModel(String mob, String upass) {
        this.mobile = mob;
        this.password = upass;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
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

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "AuthorityLoginModel{" + "aid=" + aid + ", id=" + id + ", mobile=" + mobile + ", password=" + password + ", aname=" + aname + '}';
    }

}
