package model;

import java.sql.*;

public class DbaseConnection {
    public static Connection connectWithDb (){
            Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/students", "user", "user");
        } catch (SQLException e) {
            System.out.println("Can't connect to database");
            System.out.println("SQL STATE: " + e.getSQLState() + '\n');
        }
        return con;
    }
}
