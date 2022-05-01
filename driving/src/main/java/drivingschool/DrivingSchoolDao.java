/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drivingschool;

import com.gi.signup.*;
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
 * @author DELL
 */
public class DrivingSchoolDao {

    Connection con;

    public DrivingSchoolDao() throws ClassNotFoundException, SQLException {
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

    public int insertcustomer(DrivingSchoolMoodel cm) throws SQLException {
        //int id = cm.getId();
        String fname = cm.getDrivingSchoolName();        
        String email = cm.getEmailId();
        String add = cm.getCurrentAddress();        
        long mobile = cm.getMobile();
        String password = cm.getPassword();
        int DOB = cm.getYearOfEstablishment();
        String contactPersonName = cm.getContactPersonName();
        
        String query = "INSERT INTO `driving_school` (`name`, `address`, `email`, `year_of_establishment`, `contact_no`, `contact_person`, `password`) VALUES (?,?,?,?,?,?,?)";
                
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, fname);
        ps.setString(2, add);
        ps.setString(3, email);
        ps.setInt(4, DOB);
        ps.setString(5, ""+mobile);
        ps.setString(6, contactPersonName);
        ps.setString(7, password);
        System.out.println(ps);
        return ps.executeUpdate();
    }

}
