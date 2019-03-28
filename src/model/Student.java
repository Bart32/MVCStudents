package model;
import controller.StudentController;

public class Student extends  Person{

    private int currentSemester;
    static private int albumNo = 0;

    public int getCurrentSemester() {
        return currentSemester;
    }

    public int getAlbumNo() {
        return albumNo += 1;
    }

    public Student(){
        this.currentSemester = 0;
    };

    public Student(int currentSemester) {
        this.currentSemester = currentSemester;
    };
    public Student(String name, String surname, int age, int currentSemester) {
        super(name, surname, age);
        this.currentSemester = currentSemester;
    };
};