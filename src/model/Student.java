package model;
import model.StudentFromDbase;
public class Student extends  Person{

    private int currentSemester;
    private int albumNo;

    public int getCurrentSemester() {
        return currentSemester;
    }
    public int getAlbumNo() {
        return albumNo;
    }

    StudentFromDbase studentFromDbase = new StudentFromDbase();

    public Student(){
        setName(studentFromDbase.getNameDbase());
        setSurname(studentFromDbase.getSurnameDbase());
        setAge(studentFromDbase.getAgeDbase());
        this.currentSemester =  studentFromDbase.getCurrentSemesterDbase();
        this.albumNo =  studentFromDbase.getAlbumNoDbase();
    };

    public Student (String name, String surname, int age){
        super(name, surname, age);
    };

    public Student(String name, String surname, int age, int currentSemester, int AlbumNo) {
        super(name, surname, age);
        this.currentSemester = currentSemester;
        this.albumNo = AlbumNo;
    };
};