package controller;
import model.Student;
import view.StudentView;
import java.util.ArrayList;
import java.util.List;


public class StudentController {
    public void run(){
        StudentView view  = new StudentView();
        Student first = new Student("Jacek","Placek",1, 1 );
        Student second = new Student();
        Student third = new Student();
        List<Student> students = new ArrayList<>();
        students.add(first);
        students.add(second);
        students.add(third);
        view.printStudentsDetail(students);
    }
}

