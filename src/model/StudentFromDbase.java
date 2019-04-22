package model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentFromDbase {
    private static int albumNoDbase;
    private static String nameDbase;
    private static String surnameDbase;
    private static int ageDbase;
    private static int currentSemesterDbase;
    private static List<Student> listOfStudents = new ArrayList<>();
    public static int getAlbumNoDbase() {
        return albumNoDbase;
    }
    public static String getNameDbase() {
        return nameDbase;
    }
    public static String getSurnameDbase() {
        return surnameDbase;
    }
    public static int getAgeDbase() {
        return ageDbase;
    }
    public static int getCurrentSemesterDbase() {
        return currentSemesterDbase;
    }
    public static List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public static void getStudentsFromDatabase(ResultSet rs) throws SQLException {
        while(rs.next()){
            albumNoDbase=  rs.getInt("id");
            nameDbase =  rs.getString("name");
            surnameDbase = rs.getString("surname");
            ageDbase =  rs.getInt("age");
            currentSemesterDbase =  rs.getInt("currentSemester");
            listOfStudents.add(new Student ());
        }
    }
}
