/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gi.signup;

import com.mysql.cj.Query;
import com.mysql.cj.xdevapi.SessionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KOUSALYAA
 */
public class SignupDao {

    Connection con;

    public SignupDao() throws ClassNotFoundException, SQLException {
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

    public int insertcustomer(SignupModel cm) throws SQLException {
        //int id = cm.getId();
        String fname = cm.getFirst_name();
        String lname = cm.getLast_name();
        String email = cm.getEmail_id();
        String add = cm.getCurrent_address();
        String birthp = cm.getBirth_place();
        String mobile = cm.getMobile();
        String password = cm.getPassword();
        String DOB = cm.getDob();
        
//        String query = "INSERT INTO `customer` (`first_name`, `last_name`, `dob`, `birth_place`, `email_id`, `current_address`, `mobile`, `password`) VALUES ('1', 'a', 'a', 'a', 'a', 'a', 'a', '123', 'a');";
        String query = "INSERT INTO `customer` (`first_name` ,`last_name`, dob, birth_place, `email_id`, `current_address`, `mobile`,`password`) VALUES (?,?,?,?,?,?,?,?)";
        System.out.println(query);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, fname);
        ps.setString(2, lname);
        ps.setString(3, DOB);
        ps.setString(4, birthp);
        ps.setString(5, email);
        ps.setString(6, add);
        ps.setString(7, mobile);
        ps.setString(8, password);
        System.out.println(ps);
        return ps.executeUpdate();
    }

}
