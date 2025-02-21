import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int N) {
        if (N <= 1) return false; // 0 і 1 не є простими числами

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число N: ");
        int N = scanner.nextInt();
        scanner.close();

        // Виклик методу та вивід результату
        System.out.println("isPrime(" + N + ") → " + isPrime(N));
    }
}
