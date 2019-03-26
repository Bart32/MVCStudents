package model;
import controller.StudentController;

public class Student{

    private int currentSemester;
    private int albumNo;

    public int getCurrentSemester() {
        return currentSemester;
    }

    public int getAlbumNo() {
        return albumNo;
    }

    public Student() {
    }

    public Student(int albumNo, int currentSemester) {
        this.albumNo = albumNo;
        this.currentSemester = currentSemester;
    };
};