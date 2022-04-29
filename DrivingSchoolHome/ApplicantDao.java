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
 * @author sundermetpalli
 */
public class ApplicantDao {
    Connection con;
    ResultSet rs;

    public ApplicantDao() throws ClassNotFoundException, SQLException {
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

   public List<ApplicantModel> fetchApplicant()throws Exception{
        //int id = cm.getId();

        /*String dsname = cm.getDriving_school_name();
        String contactno = cm.getContact_no();
        String vehicle = cm.getVehicle();
        String applydate = cm.getApply_date();
        String status = cm.getStatus();*/

        
        String query = "SELECT ds.*,anv.*,adl.*,dsv.* FROM customer ds,addnewvehicle anv, apply_driving_license adl, driving_school_vehicle dsv WHERE adl.customer_id = ds.customer_id AND adl.school_vehicle_id = dsv.school_vehicle.id AND dsv.vehicle_id = anv.Id";
        System.out.print(query);
        
        PreparedStatement ps = con.prepareStatement(query);

        rs = ps.executeQuery();
        
        List<ApplicantModel> list = new ArrayList<>();
        
        while(rs.next())
        {
            ApplicantModel pojo = new ApplicantModel();
            pojo.setId(rs.getString("customer_id"));
            pojo.setCustomer_name(rs.getString("first_name") + rs.getString("last_name"));
            pojo.setCustomer_contact(rs.getString("contact_no"));
            pojo.setVehicle(rs.getString("anv_Name"));
            pojo.setApply_date(rs.getString("apply_date"));
            pojo.setStatus(rs.getString("status"));
            
            /*String x = rs.getString("active_status");
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
