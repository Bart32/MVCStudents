package controller;
import model.Student;
import model.StudentFromDbase;
import view.StudentView;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

    public void run() throws SQLException{
        StudentView view  = new StudentView();
        DbaseController dbaseController = new DbaseController();
        dbaseController.loadStudentsFromDatabase();
        StudentFromDbase studentFromDbase = new StudentFromDbase();
        Student firstStudent = new Student("Bartosz", "Kosiec", 22, 2, 0);
        studentFromDbase.getListOfStudents().add(firstStudent);
        view.printStudentsDetail(studentFromDbase.getListOfStudents());
    }
}