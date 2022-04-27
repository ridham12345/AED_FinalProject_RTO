/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AuthorityLogin;

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
public class DrivingSchoolDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

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

    public List<DrivingSchoolModel> fetchDrivingSchool() throws SQLException {
        String q = "select * from driving_school";
        ps = con.prepareStatement(q);

        rs = ps.executeQuery();

        List<DrivingSchoolModel> list = new ArrayList<>();

        while (rs.next()) {
            DrivingSchoolModel pojo = new DrivingSchoolModel();
            pojo.setId(rs.getInt("driving_school_id"));
            pojo.setName(rs.getString("name"));
            pojo.setAddress(rs.getString("address"));
            pojo.setEmail(rs.getString("email"));
            pojo.setYoe(rs.getString("year_of_establishment"));
            pojo.setContactno(rs.getString("contact_no"));
            pojo.setContactperson(rs.getString("contact_person"));

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
