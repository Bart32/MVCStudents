package model;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class StudentFromDbaseTest {

    @Test
    void getStudentsFromDatabase() throws SQLException {
        StudentFromDbase studentFromDbase = new StudentFromDbase();
        Connection con = DbaseConnection.connectWithDb();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        studentFromDbase.getStudentsFromDatabase(rs);
        Assert.assertTrue(studentFromDbase.getListOfStudents() != null);
    }
}


