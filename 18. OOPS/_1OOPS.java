import java.util.*;

public class _1OOPS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an object of a class --->
        Pen cello = new Pen(); // Class Object = new Constructor(of a Class)

        // Setting values to attributes using method(function) of a cello object --->
        cello.setColor("Blue");
        cello.setTip(5);

        cello.color = "Red";

        // Printing the values of a object --->
        System.out.println("\nCello pen with Color: '" + cello.color + "' & Thickness: '" + cello.tip + "'\n");

        // -----------------------------------------------------------
        // ------------- Access Specifiers -------------
        // ---- private, default, protected, public ----
        BankAccount myAccount = new BankAccount();
        // myAccount.password = "jspm#123"; ---> ERROR
        /*
         * It gives an Error, because it is private,
         * we can't access it outside the BankAccount class.
         */
        myAccount.setPassword("prathamesh", "jspm#123");

        sc.close();
    }
}

// Creating a Pen class --->
class Pen {
    // Attributes -
    String color;
    int tip;

    // Functions/ Methods -
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class BankAccount {
    /*
     * Specifier | Within class | Within package | Outside package subclass only |
     * Outside package
     */
    // private | Y | N | N | N
    // ---> Only access within a class

    // default | Y | Y | N | N
    // ---> Only access within a class and within a package

    // protected | Y | Y | Y | N
    // ---> Can't access outside the package

    // public | Y | Y | Y | Y
    // ---> Access anywhere

    public String username;
    private String password;

    public void setPassword(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void getPassword() {
        System.out.println(this.username + " " + this.password);
    }

}