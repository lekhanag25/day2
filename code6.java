public class Code6 {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two float values
    public float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Code6 calc = new Code6();

        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(double, double): " + calc.add(10.5, 20.5));
        System.out.println("add(int, int, int): " + calc.add(10, 20, 30));
        System.out.println("add(float, float): " + calc.add(10.5f, 20.5f));
    }
}