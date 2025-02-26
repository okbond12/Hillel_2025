public class XyzMiddle {
    public static boolean xyzMiddle(String str) {
        int len = str.length();
        int xyzIndex = str.indexOf("xyz");


        if (xyzIndex == -1) return false;


        while (xyzIndex != -1) {
            int left = xyzIndex;
            int right = len - (xyzIndex + 3);


            if (Math.abs(left - right) <= 1) {
                return true;
            }


            xyzIndex = str.indexOf("xyz", xyzIndex + 1);
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(xyzMiddle("AAxyzBB"));  // true
        System.out.println(xyzMiddle("AxyzBB"));   // true
        System.out.println(xyzMiddle("AxyzBBB"));  // false
        System.out.println(xyzMiddle("xyz"));      // true
        System.out.println(xyzMiddle("xy"));       // false
    }
}