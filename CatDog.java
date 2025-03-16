public class CatDog {
    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;


        for (int i = 0; i <= str.length() - 3; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals("cat")) {
                catCount++;
            } else if (sub.equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }

    public static void main(String[] args) {

        System.out.println(catDog("catdog"));       // true
        System.out.println(catDog("catcat"));       // false
        System.out.println(catDog("1cat1cadodog")); // true
        System.out.println(catDog("dogcatdogcat")); // true
        System.out.println(catDog("catdogcat"));    // false
    }
}
