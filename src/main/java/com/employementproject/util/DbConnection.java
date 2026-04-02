package com.employementproject.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private  static final String URL = "jdbc:mysql://localhost:3306/hexaware";
    private static final String USER = "root";
    private static final String PASSWORD = "root@123";

    public static Connection getConnection() {
        Connection con=null;
        try {
             con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
           
            e.printStackTrace();
        }

            

        
        return con;
    }
}


