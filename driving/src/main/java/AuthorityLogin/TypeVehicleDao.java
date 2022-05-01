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
public class TypeVehicleDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public TypeVehicleDao() throws ClassNotFoundException, SQLException {
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

    public  List<TypeVehicleModel> fetchTypeVehicle() throws Exception {
        String q = "select * from addnewvehicle";
        ps = con.prepareStatement(q);

        rs = ps.executeQuery();

        List<TypeVehicleModel> list = new ArrayList<>();

        while (rs.next()) {
            TypeVehicleModel pojo = new TypeVehicleModel();
            pojo.setId(rs.getInt("Id"));
            pojo.setName(rs.getString("anv_Name"));
            pojo.setFees(rs.getString("anv_Fee"));

            
            list.add(pojo);
        }
        
        return list;
    }
}

/*public boolean fetchTypeVehicle(TypeVehicleModel cm) throws SQLException {
        //int id = cm.getId();
              
        int id = cm.getId();
        String name = cm.getName();
        String fees = cm.getFees();
        
        String query = "select * from addnewvehicle";
                
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, fees);
        System.out.println(ps);
        rs = ps.executeQuery();
        
        return rs.next();
    }*/
