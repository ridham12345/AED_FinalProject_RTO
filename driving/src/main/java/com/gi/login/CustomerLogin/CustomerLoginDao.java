/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gi.login.CustomerLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author KOUSALYAA
 */
public class CustomerLoginDao {
 
    Connection con;
    
    public CustomerLoginDao() throws ClassNotFoundException, SQLException {
        //load driver
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        //create  connection
        //url : protocol + IP + port_number + db_name
        String url = "jdbc:mysql://localhost:3306/driving?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
    }
      public int updatePassword(int id,String password)throws Exception
    {
        String query = "update customer set password = ? where customer_id = ?";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, password);
        st.setInt(2,id);
        return st.executeUpdate();
    }
    public CustomerLoginModel fetchcustomer(CustomerLoginModel lm) throws SQLException {
        //int id = cm.getId();
        String mobile = lm.getMobile();
        String password = lm.getPassword();

        String query = "select * from customer where mobile=? and password=?";

        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, mobile);
        st.setString(2, password);
        
        ResultSet rst = st.executeQuery();
        System.out.println(st);
        if(rst.next())
        {
            System.err.println("from if");
            CustomerLoginModel  obj = new CustomerLoginModel();
            obj.setCid(rst.getInt("customer_id"));
            obj.setCname(rst.getString("first_name"));
            return obj;   
        }
        else
        {
            return null;
        }

    }
    
}
