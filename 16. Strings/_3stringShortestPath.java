import java.util.*;

public class _3stringShortestPath {

    public static float shortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N')
                y++;
            else if (path.charAt(i) == 'S')
                y--;
            else if (path.charAt(i) == 'E')
                x++;
            else
                x--;
        }
        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Direction (N, S, E, W) Path String: ");
        String path = sc.next();

        System.out.print("Shortest Path is: " + shortestPath(path));

        sc.close();
    }
}