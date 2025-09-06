package LLD.DesignHotelManagementSystem;

public class Customer {
    String name;
    int age; 
    String dob;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    Customer(String name, int age, String dob){
        this.name = name;
        this.age = age;
        this.dob = dob;
    }
}
