public class StringEnds {
    public static boolean endsWith(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return a.endsWith(b) || b.endsWith(a);
    }

    public static void main(String[] args) {
        System.out.println(endsWith("AbC", "HiaBc"));    // true
        System.out.println(endsWith("abc", "abXabc"));   // true
        System.out.println(endsWith("hello", "lo"));     // true
        System.out.println(endsWith("Hi", "hello"));     // false
    }
}