/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gi.login.AdminLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author KOUSALYAA    
 */
public class AdminLoginDao {
    
    Connection con;
    ResultSet rst;
    public AdminLoginDao() throws ClassNotFoundException, SQLException {
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
    public AdminLoginModel fetchAdmin(AdminLoginModel lm) throws SQLException {
        //int id = cm.getId();
        String mobile = lm.getMobile();
        String password = lm.getPassword();

        String query = "select * from admin where admin_mobile=? and admin_password=?";

        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, mobile);
        st.setString(2, password);
        
        rst = st.executeQuery();
        System.out.println(st);
        if(rst.next())
        {
            //System.err.println("from if");
            AdminLoginModel  obj = new AdminLoginModel();
            obj.setAdid(rst.getInt("admin_id"));
            obj.setAdname(rst.getString("admin_name"));
            return obj;   
        }
        else
        {
            return null;
        }

    }
}
