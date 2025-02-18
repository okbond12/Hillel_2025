public class PowerCalculator {

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        int result = power(a, b);

        // Вивід результату
        System.out.println(a + " в степені " + b + " = " + result);
    }
}
