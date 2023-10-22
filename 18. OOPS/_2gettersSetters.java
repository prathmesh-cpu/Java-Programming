import java.util.*;

public class _2gettersSetters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pen cello = new Pen();

        cello.setColor("Blue");
        System.out.println(cello.getColor());
        
        cello.setTip(5);
        System.out.println(cello.getTip());

        cello.setColor("Red");
        System.out.println(cello.getColor());

        sc.close();
    }
}

class Pen {
    private String color;
    private int tip;

    // this ---> Used to refer to the current object.

    // Setters --->
    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    // Getters --->
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }
}