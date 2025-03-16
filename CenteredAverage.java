import java.util.Arrays;

public class CenteredAverage {
    public static int centeredAverage(int[] nums) {

        Arrays.sort(nums);

        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            sum += nums[i];
        }

        return sum / (nums.length - 2);
    }

    public static void main(String[] args) {

        System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));       // 3
        System.out.println(centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7})); // 5
        System.out.println(centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));// -3
        System.out.println(centeredAverage(new int[]{5, 3, 4, 6, 2}));        // 4
    }
}
