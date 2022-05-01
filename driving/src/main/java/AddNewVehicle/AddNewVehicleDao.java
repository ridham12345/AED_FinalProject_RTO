/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AddNewVehicle;

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
public class AddNewVehicleDao {

    Connection con;
    ResultSet rs;

    public AddNewVehicleDao() throws ClassNotFoundException, SQLException {
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

    public int insertvehicle(AddNewVehicleModel cm) throws SQLException {
        //int id = cm.getId();
              
        String name = cm.getName();
        String fee = cm.getAnfees();
        
        String query = "INSERT INTO `addnewvehicle` (`anv_Name`, `anv_Fee`) VALUES (?,?)";
                
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);
        ps.setString(2, fee);
        System.out.println(ps);
        
        return ps.executeUpdate();
        
    }

}
