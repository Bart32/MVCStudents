package controller;
import model.Student;
import view.StudentView;

public class StudentController {

    public void run(){
        StudentView view  = new StudentView();
        Student first = new Student(1,1 );
        view.printStudentsDetail(first);

    }
}

