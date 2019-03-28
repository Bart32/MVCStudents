package view;
import model.Student;
import java.util.List;


public class StudentView {
    public void printStudentsDetail(List<Student> students) {
        for (Student student : students) {
            System.out.println("Student number: " + student.getAlbumNo() + " Current semester: " + student.getCurrentSemester());
        }
    }
}
