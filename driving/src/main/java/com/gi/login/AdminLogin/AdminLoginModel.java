
package com.gi.login.AdminLogin;

public class AdminLoginModel {

    int adid;
    String id;
    String mobile;
    String password;
    String adname;

    public AdminLoginModel() {
    }

    public AdminLoginModel(int adid, String id, String mobile, String password, String adname) {
        this.adid = adid;
        this.id = id;
        this.mobile = mobile;
        this.password = password;
        this.adname = adname;
    }

    public AdminLoginModel(String mob, String upass) {
        this.mobile = mob;
        this.password = upass;
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

    public int getAdid() {
        return adid;
    }

    public void setAdid(int adid) {
        this.adid = adid;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    @Override
    public String toString() {
        return "AdminLoginModel{" + "adid=" + adid + ", id=" + id + ", mobile=" + mobile + ", password=" + password + ", adname=" + adname + '}';
    }

    

    
    

}
