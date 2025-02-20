import java.util.Scanner;

public class SumCalculator {

    public static String calculateSumUpToN(int N) {
        if (N <= 0) {
            return "Хибні вхідні параметри";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            result.append(i);
            if (i < N) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число N: ");
        int N = scanner.nextInt();
        scanner.close();


        System.out.println(calculateSumUpToN(N));
    }
}