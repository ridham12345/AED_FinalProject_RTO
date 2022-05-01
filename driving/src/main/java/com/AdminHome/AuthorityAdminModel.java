/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AdminHome;

/**
 *
 * @author DELL
 */
public class AuthorityAdminModel {

    int id;
    String aname;
    String amobile;
    String apassword;
    String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAmobile() {
        return amobile;
    }

    public void setAmobile(String amobile) {
        this.amobile = amobile;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AuthorityAdminModel(int id, String aname, String amobile, String apassword, String status) {
        this.id = id;
        this.aname = aname;
        this.amobile = amobile;
        this.apassword = apassword;
        this.status = status;
    }

    public AuthorityAdminModel() {
    }

    @Override
    public String toString() {
        return "AuthorityAdminModel{" + "id=" + id + ", aname=" + aname + ", amobile=" + amobile + ", apassword=" + apassword + ", status=" + status + '}';
    }

    
}
