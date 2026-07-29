import java.util.ArrayList;
import java.util.Scanner;

// Abstract Class
abstract class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void performRole();

    public void displayDetails() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }
}

// Student Class
class Student extends Person {

    public Student(int id, String name) {
        super(id, name);
    }

    @Override
    public void performRole() {
        System.out.println("Role: Student");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type : Student");
    }
}

// Librarian Class
class Librarian extends Person {

    public Librarian(int id, String name) {
        super(id, name);
    }

    @Override
    public void performRole() {
        System.out.println("Role: Librarian");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type : Librarian");
    }
}

// Book Class (Encapsulation)
class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean issued;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public void displayBook() {
        System.out.println("--------------------------------");
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Status  : " + (issued ? "Issued" : "Available"));
    }
}

// Library Class
class Library {

    ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully.");
    }

    // Issue Book
    public void issueBook(int id) {
        for (Book b : books) {
            if (b.getBookId() == id) {
                if (!b.isIssued()) {
                    b.setIssued(true);
                    System.out.println("Book Issued Successfully.");
                } else {
                    System.out.println("Book Already Issued.");
                }
                return;
            }
        }
        System.out.println("Book Not Found.");
    }

    // Return Book
    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getBookId() == id) {
                if (b.isIssued()) {
                    b.setIssued(false);
                    System.out.println("Book Returned Successfully.");
                } else {
                    System.out.println("Book Was Not Issued.");
                }
                return;
            }
        }
        System.out.println("Book Not Found.");
    }

    // Search Book
    public void searchBook(int id) {
        for (Book b : books) {
            if (b.getBookId() == id) {
                b.displayBook();
                return;
            }
        }
        System.out.println("Book Not Found.");
    }

    // Display Available Books
    public void displayAvailableBooks() {
        System.out.println("\nAvailable Books");
        boolean found = false;

        for (Book b : books) {
            if (!b.isIssued()) {
                b.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Books Available.");
        }
    }
}

// Main Class
public class Code10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        Student student = new Student(101, "Rahul");
        Librarian librarian = new Librarian(1, "Admin");

        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. Display Available Books");
            System.out.println("6. Display Student Details");
            System.out.println("7. Display Librarian Details");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    library.issueBook(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    library.returnBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    library.searchBook(sc.nextInt());
                    break;

                case 5:
                    library.displayAvailableBooks();
                    break;

                case 6:
                    student.performRole();
                    student.displayDetails();
                    break;

                case 7:
                    librarian.performRole();
                    librarian.displayDetails();
                    break;

                case 8:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 8);

        sc.close();
    }
}