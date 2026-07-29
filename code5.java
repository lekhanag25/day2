import java.util.Scanner;

// Parent class
class Person {
    String name;
    int age;

    public void getPersonDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine(); // Consume newline
    }
}

// Child class 1
class Student extends Person {
    String course;

    public void getStudentDetails(Scanner sc) {
        System.out.print("Enter Course: ");
        course = sc.nextLine();
    }

    public void displayStudent() {
        System.out.println("\nStudent Details");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }
}

// Child class 2
class Faculty extends Person {
    String subject;

    public void getFacultyDetails(Scanner sc) {
        System.out.print("Enter Subject: ");
        subject = sc.nextLine();
    }

    public void displayFaculty() {
        System.out.println("\nFaculty Details");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Subject : " + subject);
    }
}

// Child class 3
class Admin extends Person {
    String department;

    public void getAdminDetails(Scanner sc) {
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    public void displayAdmin() {
        System.out.println("\nAdmin Details");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
    }
}

// Main class
public class Code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student Object
        Student student = new Student();
        System.out.println("Enter Student Details");
        student.getPersonDetails(sc);
        student.getStudentDetails(sc);

        // Faculty Object
        Faculty faculty = new Faculty();
        System.out.println("\nEnter Faculty Details");
        faculty.getPersonDetails(sc);
        faculty.getFacultyDetails(sc);

        // Admin Object
        Admin admin = new Admin();
        System.out.println("\nEnter Admin Details");
        admin.getPersonDetails(sc);
        admin.getAdminDetails(sc);

        // Display Details
        student.displayStudent();
        faculty.displayFaculty();
        admin.displayAdmin();

        sc.close();
    }
}