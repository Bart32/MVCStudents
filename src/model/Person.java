package model;

public class Person {
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private String surname;
    private int age;
    public Person() {
        this("-", "-", 0);
    }
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
