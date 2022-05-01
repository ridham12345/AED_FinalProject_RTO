/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrivingSchoolHome;

import com.drivingschool.ApplicantDetails;
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
   public int updateStatus(ApplicantModel model,int reg_id)throws Exception
   {
       String query = "update apply_driving_license set status = ? where apply_id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(2, reg_id);
        ps.setString(1, "accepted");
       return ps.executeUpdate();
   }
   public List<ApplicantDetails> fetchApplicant()throws Exception{
        
        String query = "SELECT adl.apply_id,c.*,anv.*,adl.* FROM customer c,addnewvehicle anv, apply_driving_license adl WHERE c.customer_id = adl.customer_id and anv.Id = adl.vehicle_id";
        //String query = "SELECT c.*,anv.*,adl.* FROM customer c,addnewvehicle anv, apply_driving_license adl WHERE c.customer_id = adl.customer_id and anv.Id = adl.vehicle_id and adl.driving_school_id = ";
        System.out.print(query);
        
        PreparedStatement ps = con.prepareStatement(query);

        rs = ps.executeQuery();
        /*
        List<ApplicantModel> list = new ArrayList<>();
        
        while(rs.next())
        {
            ApplicantModel pojo = new ApplicantModel();
            pojo.setId(rs.getString("customer_id"));
            pojo.setCustomer_name(rs.getString("first_name") +" "+ rs.getString("last_name"));
            pojo.setCustomer_contact(rs.getString("mobile"));
            pojo.setVehicle(rs.getString("anv_Name"));
            pojo.setApply_date(rs.getString("apply_date"));
            pojo.setStatus(rs.getString("status"));
        }
            list.add(pojo);
            */
        List<ApplicantDetails> list = new ArrayList<>();
        
        while(rs.next())
        {
            ApplicantModel pojo = new ApplicantModel();
            pojo.setId(rs.getString("customer_id"));
            pojo.setCustomer_name(rs.getString("first_name") +" "+ rs.getString("last_name"));
            pojo.setCustomer_contact(rs.getString("mobile"));
            pojo.setVehicle(rs.getString("anv_Name"));
            pojo.setApply_date(rs.getString("apply_date"));
            pojo.setStatus(rs.getString("status"));
            
            ApplicantDetails detail = new ApplicantDetails();
            detail.setApplicant(pojo);
            detail.setId(rs.getInt("apply_id"));
        
            list.add(detail);
                    
        }
        
        return list;
    }

}
