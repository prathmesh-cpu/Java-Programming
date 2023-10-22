import java.util.*;

public class _9super {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Horse h = new Horse();
        System.out.println(h.color);

        sc.close();
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal constructor is called...");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "Brown";
        System.out.println("Horse constructor is called...");
    }
}