import java.util.Scanner;

// Abstract class
abstract class Shape {
    // Abstract method
    abstract void calculateArea();
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}

// Triangle class
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}

// Main class
public class Code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);

        // Rectangle
        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double width = sc.nextDouble();
        Shape rectangle = new Rectangle(length, width);

        // Triangle
        System.out.print("Enter base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = sc.nextDouble();
        Shape triangle = new Triangle(base, height);

        // Display areas
        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();

        sc.close();
    }
}