package controller;
import model.Student;
import view.StudentView;
import java.util.ArrayList;
import java.util.List;


public class StudentController {

    public void run(){
        StudentView view  = new StudentView();
        Student first = new Student(1,1 );
        Student second = new Student(2,1 );
        List<Student> students = new ArrayList<>();
        students.add(first);
        students.add(second);
        view.printStudentsDetail(students);
    }
}

