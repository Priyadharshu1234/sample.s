import java.util.Scanner;
class Student {
    private String name;
    private int age;
    private double salary;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Abi");
        student.setAge(20);
        student.setSalary(25000);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Salary: " + student.getSalary());
    }
}