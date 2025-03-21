public class StringDoubler {
    public static String doubleChars(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c).append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(doubleChars("The"));       // TThhee
        System.out.println(doubleChars("AAbb"));      // AAAAbbbb
        System.out.println(doubleChars("Hi-There"));  // HHii--TThheerree
    }
}