package Company_Task;

import java.util.Scanner;

class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class CreateObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student(); // Object creation

        System.out.print("Enter name: ");
        s.name = sc.next();

        System.out.print("Enter age: ");
        s.age = sc.nextInt();

        s.display();
    }
}

