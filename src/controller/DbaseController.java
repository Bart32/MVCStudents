package controller;

import model.DbaseConnection;
import model.StudentFromDbase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbaseController {

    public static void loadStudentsFromDatabase() throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        DbaseConnection dbaseConnection = new DbaseConnection();
        Connection con = dbaseConnection.connectWithDb();
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("SELECT * FROM students");
            StudentFromDbase.getStudentsFromDatabase(rs);

        } catch (SQLException e) {
            System.out.println("Something is wrong! SQL STATE: " + e.getSQLState() + '\n');
        }

        finally{
                if (con != null) {
                    con.close();
                }

                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            }
        }
    }