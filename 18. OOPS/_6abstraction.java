import java.util.*;

public class _6abstraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Horse h = new Horse();
        h.walk();
        h.eat();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);

        // --------------------------------------
        System.out.println("-------------------------------------------------");
        Chicken c = new Chicken();
        c.walk();
        System.out.println(c.color);
        c.changeColor();
        System.out.println(c.color);

        sc.close();
    }
}

// Abstract Class ----------->
abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called...");
        color = "Brown";
    }

    void eat() {
        System.out.println("Eats");
    }

    abstract void walk(); // It doesn't have implementation
    // Means all animal should have walk() function but it is exactly how,
    // it will tell it's subclasses.
}

// When creating subclass it gives error.
// Beacause for subclass it's compulsory to have walk() method
class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called...");
    }

    void changeColor() {
        color = "Dark Brown";
    }

    void walk() {
        System.out.println("Walks on 4 Legs");
    }
}

class Chicken extends Animal {

    Chicken() {
        System.out.println("Chicken constructor called...");
    }

    void changeColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("Walks on 2 Legs");
    }
}