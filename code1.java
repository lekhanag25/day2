import java.util.Scanner;

class Student {
    // Private data members
    private int studentId;
    private String studentName;
    private String course;
    private int marks;

    // Getter and Setter for studentId
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter and Setter for studentName
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter and Setter for course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Getter and Setter for marks with validation
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks! Marks should be between 0 and 100.");
            this.marks = 0;
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);
    }
}

public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter Student ID: ");
        student.setStudentId(sc.nextInt());
        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        student.setStudentName(sc.nextLine());

        System.out.print("Enter Course: ");
        student.setCourse(sc.nextLine());

        System.out.print("Enter Marks: ");
        student.setMarks(sc.nextInt());

        System.out.println("\nStudent Details");
        student.displayDetails();

        sc.close();
    }
}