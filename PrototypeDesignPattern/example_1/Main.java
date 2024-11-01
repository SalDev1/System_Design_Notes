package PrototypeDesignPattern.example_1;

/**
 * Main
 */
public class Main {
    public static boolean compareTwoObjects(Student s1 , Student s2) {
        return s1.age == s2.age && s2.name == s1.name;
    }
    public static void main(String[] args) {

        Student s1 = new Student(12,1,"Salman Uddin");
        Student s2 = (Student) s1.clone();  // Prototype design pattern , cloning the object.

        // Normal way of cloning the object.
        /*
         * You will get an error over here , since you can't 
         * directly accessed the private variables as they are only available within the class.
         */
        // Student cloneObj = new Student();
        // cloneObj.age = obj.age;
        // cloneObj.name = obj.name;
        // cloneObj.rollNumber = obj.rollNumber;

        if(compareTwoObjects(s1,s2)) {
            System.out.println("The two objects are exactly the same.");
        } else {
            System.out.println("The two objects are not exactly the same.");   
        }
    }
}
