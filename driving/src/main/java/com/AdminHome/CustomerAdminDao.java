/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AdminHome;

import com.gi.signup.SignupModel;
import customerLogin.CustomerDao;
import customerLogin.CustomerModel;
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
    public class CustomerAdminDao {
  Connection con;
    ResultSet rs;
    
    public CustomerAdminDao() throws ClassNotFoundException, SQLException {
        //load driver
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        //create  connection
        //url : protocol + IP + port_number + db_name
        String url = "jdbc:mysql://localhost:3306/driving?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
    }
    public List<SignupModel> fetchCustomers() throws SQLException {
        String q = "select * from customer";
        PreparedStatement ps = con.prepareStatement(q);

        rs = ps.executeQuery();

        List<SignupModel> list = new ArrayList<>();

        while (rs.next()) {
            SignupModel pojo = new SignupModel();
            pojo.setId(rs.getInt("customer_id"));
            pojo.setFirst_name(rs.getString("first_name"));
            pojo.setLast_name(rs.getString("last_name"));
            pojo.setDob(rs.getString("dob"));
            pojo.setBirth_place(rs.getString("birth_place"));
            pojo.setEmail_id(rs.getString("email_id"));
            pojo.setCurrent_address(rs.getString("current_address"));
            pojo.setMobile(rs.getString("mobile"));
            
            list.add(pojo);
        }
        return list;
    }
}

