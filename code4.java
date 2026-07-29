import java.util.Scanner;

// Parent class
class Vehicle {
    String brand;
    int speed;

    public void getVehicleDetails(Scanner sc) {
        System.out.print("Enter Brand: ");
        brand = sc.nextLine();

        System.out.print("Enter Speed: ");
        speed = sc.nextInt();
        sc.nextLine(); // Consume newline
    }
}

// Child class
class Car extends Vehicle {
    String model;

    public void getCarDetails(Scanner sc) {
        System.out.print("Enter Model: ");
        model = sc.nextLine();
    }
}

// Grandchild class
class ElectricCar extends Car {
    int batteryCapacity;

    public void getElectricCarDetails(Scanner sc) {
        System.out.print("Enter Battery Capacity (kWh): ");
        batteryCapacity = sc.nextInt();
    }

    public void displayDetails() {
        System.out.println("\nElectric Car Details");
        System.out.println("Brand            : " + brand);
        System.out.println("Speed            : " + speed + " km/h");
        System.out.println("Model            : " + model);
        System.out.println("Battery Capacity : " + batteryCapacity + " kWh");
    }
}

// Main class
public class Code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ElectricCar car = new ElectricCar();

        car.getVehicleDetails(sc);
        car.getCarDetails(sc);
        car.getElectricCarDetails(sc);

        car.displayDetails();

        sc.close();
    }
}