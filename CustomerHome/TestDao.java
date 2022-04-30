/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerHome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KOUSALYAA
 */
public class TestDao {
    Connection con;
    ResultSet rs;

    public TestDao() throws ClassNotFoundException, SQLException {
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

   public List<TestModel> fetchTest()throws Exception{
        //int id = cm.getId();

        /*String dsname = cm.getDriving_school_name();
        String contactno = cm.getContact_no();
        String vehicle = cm.getVehicle();
        String applydate = cm.getApply_date();
        String status = cm.getStatus();*/

        /*String query = "SELECT driving_school.driving_school_id,driving_school.name,driving_school.contact_no, addnewvehicle.anv_Name,apply_driving_license.apply_date,apply_driving_license.status "
                + "     FROM driving_school "
                + "     LEFT JOIN apply_driving_license "
                + "     ON driving_school.driving_school_id = apply_driving_license.driving_school_id "
                + "     LEFT JOIN addnewvehicle "
                + "     ON addnewvehicle.id = apply_driving_license.driving_school_id;";*/
        String query = "SELECT ds.*,anv.*,adl.* FROM driving_school ds,addnewvehicle anv, apply_driving_license adl WHERE ds.driving_school_id = adl.driving_school_id and anv.Id = adl.vehicle_id";
        System.out.print(query);
        
        PreparedStatement ps = con.prepareStatement(query);

        rs = ps.executeQuery();
        
        List<TestModel> list = new ArrayList<>();
        /*PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, dsname);
        ps.setString(2, contactno);
        ps.setString(3, vehicle);
        ps.setString(4, applydate);
        ps.setString(5, status);
        System.out.println(ps);
        rs = ps.executeQuery();

        return rs.next();*/
        while(rs.next())
        {
            TestModel pojo = new TestModel();
            pojo.setId(rs.getString("driving_school_id"));
            pojo.setDriving_school_name(rs.getString("name"));
            pojo.setContact_no(rs.getString("contact_no"));
            pojo.setVehicle(rs.getString("anv_Name"));
            pojo.setApply_date(rs.getString("apply_date"));
            /*pojo.setStatus(rs.getString("status"));
            
            String x = rs.getString("active_status");
            if(x == "Active")
            {
               pojo.setStatus("true");
            }else{
                pojo.setStatus("false");
                //pojo.setVitalId(Integer.parseInt(x));
            }*/
  
            list.add(pojo);
        }
        
        return list;
    }

    
}
