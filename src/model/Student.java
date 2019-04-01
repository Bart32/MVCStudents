package model;

public class Student extends  Person{

    private int currentSemester;
    static private int albumNo = 0;

    public int getCurrentSemester() {
        return currentSemester;
    }
    public int createUnicalAlbumNo() {
        return albumNo += 1;
    }

    public Student(){
    };

    public Student (String name, String surname, int age){
        super(name, surname, age);
    };

    public Student(String name, String surname, int age, int currentSemester) {
        super(name, surname, age);
        this.currentSemester = currentSemester;
    };
};