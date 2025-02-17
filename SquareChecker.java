import java.util.Scanner;

public class SquareChecker {
    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPerfectSquare(number)) {
            System.out.println(number + " є квадратом цілого числа.");
        } else {
            System.out.println(number + " не є квадратом цілого числа.");
        }
    }
}