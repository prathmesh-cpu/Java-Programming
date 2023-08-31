import java.util.*;

public class _1arraysBasics {

    public static void updateArray(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array Creation -

        // int numbers[] = {1, 2, 3};
        // String fruits[] = {"apple", "mango", "orange"};
        int marks[] = new int[50];

        // Input -
        System.out.print("Enter The Marks of Subject-1: ");
        marks[0] = sc.nextInt(); // subject1
        System.out.print("Enter The Marks of Subject-2: ");
        marks[1] = sc.nextInt(); // subject2
        System.out.print("Enter The Marks of Subject-3: ");
        marks[2] = sc.nextInt(); // subject3
        System.out.println();

        // Output -
        System.out.println("Marks of Subject-1: " + marks[0]);
        System.out.println("Marks of Subject-2: " + marks[1]);
        System.out.println("Marks of Subject-3: " + marks[2]);
        System.out.println();

        // Update -
        marks[0] = 99;
        System.out.println("Updated Marks of Subject-1: " + marks[0]);
        System.out.println();

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Your Percentage: " + percentage + "%");
        System.out.println();

        // Array Length -
        System.out.println("Length of an Array: " + marks.length);
        System.out.println();

        // Passing Array as a Argument (Arrays are Pass by Reference) -
        System.out.println("Marks before Update: " + marks[0] + ", " + marks[1] + " " + marks[2]);
        updateArray(marks);
        System.out.println("Marks after Update: " + marks[0] + ", " + marks[1] + " " + marks[2]);
        System.out.println();

        sc.close();
    }
}