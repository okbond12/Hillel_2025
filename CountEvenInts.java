public class CountEvenInts {
    public static int countEvenInts(int[] nums) {
        int count = 0;


        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countEvenInts(new int[]{2, 1, 2, 3, 4})); // 3
        System.out.println(countEvenInts(new int[]{2, 2, 0}));        // 3
        System.out.println(countEvenInts(new int[]{1, 3, 5}));        // 0
        System.out.println(countEvenInts(new int[]{6, 8, 10, 11}));   // 3
        System.out.println(countEvenInts(new int[]{}));               // 0 (порожній масив)
    }
}