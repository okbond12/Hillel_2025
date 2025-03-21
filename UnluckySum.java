public class UnluckySum {
    public static int sumWithoutUnlucky13(int[] nums) {
        int sum = 0;
        boolean skipNext = false;

        for (int num : nums) {
            if (skipNext) {
                skipNext = false;
                continue;
            }

            if (num == 13) {
                skipNext = true;
                continue;
            }

            sum += num;
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumWithoutUnlucky13(new int[]{1, 2, 2, 1}));       // → 6
        System.out.println(sumWithoutUnlucky13(new int[]{1, 1}));             // → 2
        System.out.println(sumWithoutUnlucky13(new int[]{1, 2, 2, 1, 13}));   // → 6
        System.out.println(sumWithoutUnlucky13(new int[]{13, 5, 1, 13, 2}));  // → 1
        System.out.println(sumWithoutUnlucky13(new int[]{}));                 // → 0
    }
}