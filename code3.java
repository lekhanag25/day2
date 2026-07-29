import java.util.Scanner;

// Parent class
class Employee {
    int employeeId;
    String employeeName;
    double salary;

    public void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    public void displayEmployee() {
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary        : " + salary);
    }
}

// Child class
class Developer extends Employee {
    String programmingLanguage;

    public void getDeveloperDetails(Scanner sc) {
        System.out.print("Enter Programming Language: ");
        programmingLanguage = sc.nextLine();
    }

    public void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language : " + programmingLanguage);
    }
}

// Main class
public class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Developer dev = new Developer();

        dev.getEmployeeDetails(sc);
        dev.getDeveloperDetails(sc);

        dev.displayDeveloper();

        sc.close();
    }
}