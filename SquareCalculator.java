public class SquareCalculator {
    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Квадрат числа " + number + " = " + square);
    }

    public static void main(String[] args) {
        printSquare(5); // Тестування методу
    }
}
