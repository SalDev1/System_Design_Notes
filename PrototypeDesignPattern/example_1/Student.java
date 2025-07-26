package PrototypeDesignPattern.example_1;

public class Student implements Prototype{
    int age;
    private int rollNumber;
    String name; 

    Student() {}

    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }
    // public Student clone() {
    //     return new Student();
    // }
    @Override
    public Prototype clone() {
        return new Student(age,rollNumber,name);
    }
};
