public class MixString {
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i)).append(b.charAt(i));
        }

        // Додаємо залишкові символи (якщо є)
        if (a.length() > b.length()) {
            result.append(a.substring(minLength));
        } else if (b.length() > a.length()) {
            result.append(b.substring(minLength));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(mixString("abc", "xyz"));      // "axbycz"
        System.out.println(mixString("Hi", "There"));     // "HTihere"
        System.out.println(mixString("xxxx", "There"));   // "xTxhxexre"
    }
}
