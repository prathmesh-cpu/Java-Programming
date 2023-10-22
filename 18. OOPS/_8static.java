import java.util.*;

public class _8static {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Class.function();
        Student.setClg("JSPM's RSCOE"); // Set a static value

        Student s1 = new Student();
        s1.getInfo();

        Student s2 = new Student();
        s2.name = "Prathamesh";
        s2.rollNo = 8;
        s2.getInfo();

        sc.close();
    }
}

class Student {
    String name;
    int rollNo;

    // static - same for all objects.
    static String clgName;

    static void setClg(String name) {
        clgName = name;
    }

    void getInfo() {
        System.out.println(this.name);
        System.out.println(this.rollNo);
        System.out.println(clgName);
    }
}