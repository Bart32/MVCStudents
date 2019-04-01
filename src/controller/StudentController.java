package controller;
import model.Student;
import model.Dbase;
import view.StudentView;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

    public void run(){
        Dbase dbConn = new Dbase();
        dbConn.dbConnection();
        StudentView view  = new StudentView();
        Student first = new Student("Jacek","Placek",18);
        Student second = new Student("Bartosz", "Kosiec", 22, 2);
        Student third = new Student();
        List<Student> students = new ArrayList<>();
        students.add(first);
        students.add(second);
        students.add(third);
        view.printStudentsDetail(students);
    }
}