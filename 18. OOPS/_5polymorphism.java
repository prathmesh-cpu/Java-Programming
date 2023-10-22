import java.util.*;

public class _5polymorphism {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator cal = new Calculator();
        System.out.println(cal.sum(1, 2));
        System.out.println(cal.sum(1.5f, 2.1f));
        System.out.println(cal.sum(1, 4, 5));

        Deer d = new Deer();
        d.eat();

        sc.close();
    }
}

// Method Overloading ---> Compile time
class Calculator {
    int sum(int a, int b) {
        return (a + b);
    }

    float sum(float a, float b) {
        return (a + b);
    }

    int sum(int a, int b, int c) {
        return (a + b + c);
    }
}

// Method Overriding ---> Run time
class Animal {
    void eat() {
        System.out.println("Eat Anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats Grass");
    }
}