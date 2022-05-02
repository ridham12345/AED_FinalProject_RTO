/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gi.login.AuthorityLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author KOUSALYAA
 */
public class AuthorityLoginDao {
    
    Connection con;
    ResultSet rst;
    public AuthorityLoginDao() throws ClassNotFoundException, SQLException {
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
    public AuthorityLoginModel fetchAuthority(AuthorityLoginModel lm) throws SQLException {
        //int id = cm.getId();
        String mobile = lm.getMobile();
        String password = lm.getPassword();

        String query = "select * from authority where amobile=? and apassword=?";

        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, mobile);
        st.setString(2, password);
        
        rst = st.executeQuery();
        System.out.println(st);
        if(rst.next())
        {
            System.err.println("from if");
            AuthorityLoginModel  obj = new AuthorityLoginModel();
            obj.setAid(rst.getInt("a_id"));
            obj.setAname(rst.getString("aname"));
            return obj;   
        }
        else
        {
            return null;
        }

    }
      public int updatePassword(int id,String password)throws Exception
    {
        String query = "update admin set admin_password = ? where admin_id = ?";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, password);
        st.setInt(2,id);
        return st.executeUpdate();
    }
}
