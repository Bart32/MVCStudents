package model;

import java.sql.*;

public class DbaseConnection {
    public static Connection connectWithDb (){
            Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://mn01.webd.pl/groniek_students",
                    "groniek_admin", "admin");
            
        } catch (SQLException e) {
            System.out.println("Can't connect to database");
            e.printStackTrace();
        }
        return con;
    }
}
