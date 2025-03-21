public class SumIgnoreTool {
    public static int sumIgnoreSections(int[] nums) {
        int sum = 0;
        boolean inIgnoreSection = false;

        for (int num : nums) {
            if (num == 6) {
                inIgnoreSection = true;
            } else if (inIgnoreSection && num == 7) {
                inIgnoreSection = false;
            } else if (!inIgnoreSection) {
                sum += num;
            }
        }

        return sum;
    }

    public static void runExamples() {
        System.out.println(sumIgnoreSections(new int[]{1, 2, 2}));              // → 5
        System.out.println(sumIgnoreSections(new int[]{1, 2, 2, 6, 99, 99, 7})); // → 5
        System.out.println(sumIgnoreSections(new int[]{1, 1, 6, 7, 2}));         // → 4
        System.out.println(sumIgnoreSections(new int[]{}));                      // → 0
    }

    public static void main(String[] args) {
        runExamples(); //
    }
}