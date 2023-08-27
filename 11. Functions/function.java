import java.util.*;

public class function {

    // Functions without parameter & without return value =========>
    public static void noParaNoReturn() { // Function definition
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    // Functions without parameter & with return value =========>
    public static int noParawithReturn() {
        return 1 + 1;
    }

    // Functions with parameters & without return value =========>
    public static void paraNoReturn(int num1, int num2) { // Parameters or formal parameters
        System.out.println(num1 + num2);
    }

    // Functions with parameters & with return value =========>
    public static int paraReturn(int num1, int num2) {
        return (num1 + num2);
    }

    // ----------------------------------------------------------------------------------------------

    // Function Call by Value ===> (Functions of JAVA always works on call by value)
    public static void swapTwoNum(int num1, int num2) {
        System.out.println("Before Swap: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swap: num1 = " + num1 + ", num2 = " + num2);

    }
    // Function Call by Reference ====> (In JAVA we never use call by reference)

    // ----------------------------------------------------------------------------------------------

    // Factorial Function ====================>
    public static int fatorial(int num1) {
        int fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact *= i;
        }
        return fact;
    }

    // ----------------------------------------------------------------------------------------------

    public static float area(float radius) {
        return radius * radius * 3.142f;
    }

    public static float area(int length, int breadth) {
        return length * breadth;
    }

    public static float area(float side1, float side2, float side3) {
        float semiPeri = (side1 + side2 + side3) / 2;
        float areaOfTriangle = semiPeri * (semiPeri - side1) * (semiPeri - side2) * (semiPeri - side3);
        return (float) (Math.sqrt(areaOfTriangle));
    }

    // ----------------------------------------------------------------------------------------------

    public static boolean isPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int num1, int num2) {
        while (num1 <= num2) {
            if (isPrime(num1)) {
                System.out.print(num1 + " ");
            }
            num1++;
        }
    }

    // ----------------------------------------------------------------------------------------------

    public static int binToDec(int binNum) {
        int decNum = 0, i = 0;
        while (binNum > 0) {
            if (binNum % 10 == 0 || binNum % 10 == 1) {
                decNum += ((binNum % 10) * Math.pow(2, i));
                binNum /= 10;
                i++;
            } else {
                return 0;
            }
        }
        return decNum;
    }

    public static int decToBin(int decNum) {
        int binNum = 0, i = 0;
        while (decNum > 0) {
            binNum += ((decNum % 2) * (int) Math.pow(10, i));
            decNum /= 2;
            i++;
        }
        return binNum;
    }

    // ----------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * returnType name() {
         * // Your Code
         * return statement;
         * }
         */

        // Functions without parameter & without return value =========>
        // noParaNoReturn(); // Function call

        // Functions without parameter & with return value =========>
        // int sum = noParawithReturn();
        // System.out.println(sum);

        // Functions with parameters & without return value =========>
        // paraNoReturn(2, 2); // argument or actual parameters

        // Functions with parameters & with return value =========>
        // sum = paraReturn(3, 3);
        // System.out.println(sum);

        // ----------------------------------------------------------------------------------------------
        // Swapping two numbers =========>
        // int num1 = 5, num2 = 10;
        // swapTwoNum(num1, num2);
        // System.out.println("After swapTwoNum Runs: num1 = " + num1 + ", num2 = " +
        // num2);

        // Binomial Coefficient
        /*
         * nCr = n! / (r! * (n - r)!)
         */

        // System.out.println("--------------- Binomial Coefficient ---------------");
        // System.out.print("Enter the Value of n: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the Value of r: ");
        // int r = sc.nextInt();
        // int binCoeff = fatorial(n) / (fatorial(r) * fatorial(n - r));
        // System.out.println("Binomial Coefficient: " + binCoeff);

        // ----------------------------------------------------------------------------------------------
        // Function Overloading =========>
        /*
         * Multiple Functions with the same name but different parameters.
         * Multiple Functions with the same name but different data types.
         */

        // System.out.println("--------------- Areas of Different Shapes
        // ---------------");
        // // Area of Circle ----->
        // System.out.print("Enter Radius of Circle: ");
        // float radius = sc.nextFloat();
        // System.out.println("Area of Cicle: " + area(radius));
        // System.out.println();

        // // Area of Square ----->
        // System.out.print("Enter Side of Square: ");
        // int side = sc.nextInt();
        // System.out.println("Area of Square: " + area(side, side));
        // System.out.println();

        // // Area of Rectangle ----->
        // System.out.print("Enter Length of Rectangle: ");
        // int length = sc.nextInt();
        // System.out.print("Enter Breadth of Rectangle: ");
        // int breadth = sc.nextInt();
        // System.out.println("Area of Rectangle: " + area(length, breadth));
        // System.out.println();

        // // Area of Triangle ----->
        // System.out.print("Enter First Side of Triangle: ");
        // float side1 = sc.nextFloat();
        // System.out.print("Enter Second Side of Triangle: ");
        // float side2 = sc.nextFloat();
        // System.out.print("Enter Third Side of Triangle: ");
        // float side3 = sc.nextFloat();
        // System.out.println("Area of Triangle: " + area(side1, side2, side3));
        // System.out.println();

        // ----------------------------------------------------------------------------------------------
        // System.out.print("Enter Any Natural Number: ");
        // int num = sc.nextInt();
        // if (isPrime(num)) {
        // System.out.println(num + " is a Prime Number.");
        // } else {
        // System.out.println(num + " is not a Prime Number.");
        // }
        // System.out.println();

        // System.out.println("--------------- Prime Numbers in a Range
        // ---------------");
        // System.out.print("Enter the Initial Range: ");
        // int range1 = sc.nextInt();
        // System.out.print("Enter the Final Range: ");
        // int range2 = sc.nextInt();
        // primeInRange(range1, range2);
        // System.out.println();

        System.out.println();
        System.out.println("--------------- Decimal to Binary ---------------");
        System.out.print("Enter Binary Number: ");
        int decNum = sc.nextInt();
        int binNum = decToBin(decNum);
        System.out.print("Binary Number for '" + decNum + "' is " + binNum);
        System.out.println();

        System.out.println();
        System.out.println("--------------- Binary to Decimal ---------------");
        System.out.print("Enter Binary Number: ");
        binNum = sc.nextInt();
        decNum = binToDec(binNum);
        System.out.println("Decimal Number for '" + binNum + "' is " + decNum);
        System.out.println();

        // Scopes =========>
        // Function/ Method Scope.
        // Block Scope.

        sc.close();
    }
}