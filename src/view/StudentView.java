package view;
import controller.StudentController;
import model.Student;


public class StudentView {
    public void printStudentsDetail(Student student){
        String result =student.getAlbumNo() + " " +  student.getCurrentSemester();
        System.out.println(result);
    }
};
