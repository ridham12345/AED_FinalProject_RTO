/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gi.login;

import AuthorityLogin.AuthorityModel;
import com.gi.signup.SignupModel;
import com.mysql.cj.xdevapi.SessionFactory;
import java.io.File;
import java.lang.module.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class LoginDao {

    Connection con;
    ResultSet rs;
    public LoginDao() throws ClassNotFoundException, SQLException {
        //load driver
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        //create  connection
        //url : protocol + IP + port_number + db_name
        String url = "jdbc:mysql://localhost:3306/driving";
        String user = "root";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
    }
    public boolean fetchcustomer(LoginModel lm) throws SQLException {
        //int id = cm.getId();
        String mobile = lm.getMobile();
        String password = lm.getPassword();

        String query = "select * from customer where mobile=? and password=?";

        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, mobile);
        st.setString(2, password);

        ResultSet rst = st.executeQuery();
        return rst.next();

    }
    public boolean fetchDrivingSchool(LoginModel lm) throws SQLException {
        //int id = cm.getId();
        String mobile = lm.getMobile();
        String password = lm.getPassword();

        String query = "select * from driving_school where contact_no=? and password=?";

        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, mobile);
        st.setString(2, password);

        ResultSet rst = st.executeQuery();
        return rst.next();

    }

    public boolean fetchAuthority(LoginModel cm) throws SQLException {
        //int id = cm.getId();
              
        String mobile = cm.getMobile();
        String password = cm.getPassword();
        
        String query = "select amobile,apassword from authority where amobile=? and apassword=?";
                
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, ""+mobile);
        ps.setString(2, password);
        System.out.println(ps);
        rs = ps.executeQuery();
        
        return rs.next();
    }
}
