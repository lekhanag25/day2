class Animal {
    // Parent class method
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Child class Cow
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow moos");
    }
}

public class Code7 {
    public static void main(String[] args) {

        // Runtime Polymorphism using parent reference
        Animal animal;

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        animal = new Cow();
        animal.makeSound();
    }
}