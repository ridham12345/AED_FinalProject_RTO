/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.AdminHome;

import AuthorityLogin.AuthorityModel;
import AuthorityLogin.DrivingSchoolModel;
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
public class AuthorityAdminDao {
    Connection con;
    ResultSet rs;
    
    public AuthorityAdminDao() throws ClassNotFoundException, SQLException {
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
    public List<AuthorityModel> fetchAuthority() throws SQLException {
        String q = "select * from authority";
        PreparedStatement ps = con.prepareStatement(q);

        rs = ps.executeQuery();

        List<AuthorityModel> list = new ArrayList<>();

        while (rs.next()) {
            AuthorityModel pojo = new AuthorityModel();
            pojo.setId(rs.getInt("a_id"));
            pojo.setMobile(Long.parseLong(rs.getString("amobile")));
            pojo.setName(rs.getString("aname"));
            list.add(pojo);
        }
        return list;
    }
}
