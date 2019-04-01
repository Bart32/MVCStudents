package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbase {
    private static final String USERNAME = "user";
    private static final String PASSWORD = "user";
    private static final String CONN = "jdbc:mysql://localhost/students";

    public static void dbConnection (){
        try {
            Connection con = null;
            con = DriverManager.getConnection(CONN, USERNAME, PASSWORD);
            System.out.println("Connected");
        }
        catch(SQLException e){
            System.out.println("Can't connect to database");

        }
    }
}
