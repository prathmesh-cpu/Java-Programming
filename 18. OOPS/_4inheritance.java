import java.util.*;

public class _4inheritance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fish shark = new Fish();
        // shark.eat();

        Human jay = new Human();
        jay.eat();
        jay.breathe();
        jay.color = "Fair";
        System.out.println(jay.color);
        jay.gender = "Male";
        System.out.println(jay.gender);

        Bird parrot = new Bird();
        parrot.fly();

        sc.close();
    }
}

// Parent Class/ Base Class/ Superclass --->
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// Child class/ Derived Class/ Subclass --->

// class Fish extends Animal {
// int fins;
// void swim() {
// System.out.println("Swims in Water");
// }
// }

class Mammal extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flies");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swims");
    }
}

class Human extends Mammal {
    String gender;
}