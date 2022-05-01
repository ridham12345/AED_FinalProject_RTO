/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrivingSchoolHome;

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
public class VehicleDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public VehicleDao() throws ClassNotFoundException, SQLException {
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

    public List<VehicleModel> fetchVehicle() throws Exception {
        String q = "select * from addnewvehicle";
        ps = con.prepareStatement(q);

        rs = ps.executeQuery();

        List<VehicleModel> list = new ArrayList<>();

        while (rs.next()) {
            VehicleModel pojo = new VehicleModel();
            pojo.setId(rs.getInt("Id"));
            pojo.setName(rs.getString("anv_Name"));
            pojo.setFees(rs.getString("anv_Fee"));

            /*if(x == null)
            {
               pojo.setIsPatient(false);
            }else{
                pojo.setIsPatient(true);
                pojo.setVitalId(Integer.parseInt(x));
            }*/
            list.add(pojo);
        }

        return list;
    }
}
