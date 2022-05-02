
package CustomerHome;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ApplyDao {

    Connection con;

    public ApplyDao() throws ClassNotFoundException, SQLException {
        //load driver
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        //create  connection
        String url = "jdbc:mysql://localhost:3306/driving?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
    }

    public int insertApply(ApplyModel cm) throws SQLException {
        int cid = cm.getCid();
        String query = "insert into apply_driving_license (customer_id,driving_school_id,vehicle_id,apply_date) values (?,?,?,?)";
        
        System.out.println(query);
        
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, cid);
        ps.setInt(2, cm.getDrivingschool_id());
        ps.setInt(3, cm.getVehicle_id());
        ps.setDate(4, java.sql.Date.valueOf(cm.getApplydate()));
        System.out.println(ps);
        return ps.executeUpdate();
    }

    public Map<String,Integer> fetchDrivingSchoolName() throws SQLException {
        //int id = cm.getId();
        Map<String,Integer> map = new HashMap<>();
        ApplyModel am = new ApplyModel();

        String query = "select driving_school_id,name from driving_school";

        PreparedStatement st = con.prepareStatement(query);

        ResultSet rst = st.executeQuery();
        ResultSetMetaData rsmd = rst.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (rst.next()) {
                int id = rst.getInt("driving_school_id");
                String columnValue = rst.getString("name");
                map.put(columnValue,id);
            }
        
        return map;
    }

    public Map<String,Integer> fetchVehicle() throws SQLException {
        Map<String,Integer> map = new HashMap<>();
        ApplyModel am = new ApplyModel();

        String query1 = "select Id,anv_Name from addnewvehicle";

        PreparedStatement st = con.prepareStatement(query1);

        ResultSet rst = st.executeQuery();
        ResultSetMetaData rsmd = rst.getMetaData();
        System.out.println("querying SELECT * FROM XXX");
        int columnsNumber = rsmd.getColumnCount();
        while (rst.next()) {
            int id = rst.getInt("Id");
            String columnValue = rst.getString("anv_Name");
            map.put(columnValue,id);
        }
        return map;
    }
}
