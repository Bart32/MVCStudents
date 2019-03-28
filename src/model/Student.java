package model;
import controller.StudentController;

public class Student extends  Person{

    private int currentSemester;
    private int albumNo;

    public int getCurrentSemester() {
        return currentSemester;
    }

    public int getAlbumNo() {
        return albumNo;
    }

    public Student(){
        this(0,0);
    };

    public Student(int albumNo, int currentSemester) {
        this.albumNo = albumNo;
        this.currentSemester = currentSemester;
    };
    public Student(String name, String surname, int age, int albumNo, int currentSemester) {
        super(name, surname, age);
        this.albumNo = albumNo;
        this.currentSemester = currentSemester;
    };
};