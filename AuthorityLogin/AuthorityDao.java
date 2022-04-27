/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AuthorityLogin;

import DrivingSchoolLogin.*;
import customerLogin.*;
import drivingschool.*;
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
public class AuthorityDao {

    Connection con;
    ResultSet rs;

    public AuthorityDao() throws ClassNotFoundException, SQLException {
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

    public boolean fetchAuthority(AuthorityModel cm) throws SQLException {
        //int id = cm.getId();
              
        long mobile = cm.getMobile();
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
