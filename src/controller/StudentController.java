package controller;
import model.Student;
import model.StudentFromDbase;
import view.StudentView;
import java.sql.SQLException;

public class StudentController {

    public void run() throws SQLException{
        Student firstStudent = new Student("Bartosz", "Kosiec", 22, 2, 0);
        StudentFromDbase.getListOfStudents().add(firstStudent);
        DbaseController.loadStudentsFromDatabase();
        StudentView.printStudentsDetail(StudentFromDbase.getListOfStudents());
    }
}