import java.util.*;

public class _5trappingRainProb {

    public static int trap(int height[]) {

        // Left Max Boundary - Array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Right Max Boundary - Array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Find Total Trapped Rainwater
        int trapWater = 0;
        for (int i = 0; i < height.length; i++) {
            trapWater += (Math.min(leftMax[i], rightMax[i]) - height[i]);
        }
        return trapWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size of Array: ");
        int size = sc.nextInt();

        int height[] = new int[size];

        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }
        int trapWater = trap(height);
        System.out.println("Trap Water: " + trapWater);

        sc.close();
    }
}