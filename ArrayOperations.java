import java.util.Scanner;

public class ArrayOperations {

    public static double calculateAverage(int[] array) {
        if (array.length == 0) return 0; // Уникнення ділення на 0

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static int findMax(int[] array) {
        int max = array[0]; // Початкове значення
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0]; // Початкове значення
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void printReverseArray(int[] array) {
        System.out.print("Масив у зворотньому порядку: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean isNumberInArray(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення масиву користувачем
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Обчислення середнього значення
        double average = calculateAverage(array);
        System.out.println("Середнє значення: " + average);

        // Знаходження максимального та мінімального значення
        System.out.println("Максимальне значення: " + findMax(array));
        System.out.println("Мінімальне значення: " + findMin(array));

        // Виведення масиву у зворотньому порядку
        printReverseArray(array);

        // Перевірка, чи є задане число у масиві
        System.out.print("Введіть число для пошуку в масиві: ");
        int target = scanner.nextInt();
        if (isNumberInArray(array, target)) {
            System.out.println("Число " + target + " є у масиві.");
        } else {
            System.out.println("Числа " + target + " немає у масиві.");
        }

        scanner.close();
    }
}