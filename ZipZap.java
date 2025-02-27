public class ZipZap {
    public static String zipZap(String str) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < str.length()) {

            if (i <= str.length() - 3 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append("zp");
                i += 3;
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(zipZap("zipXzap"));   // "zpXzp"
        System.out.println(zipZap("zopzop"));    // "zpzp"
        System.out.println(zipZap("zzzopzop"));  // "zzzpzp"
        System.out.println(zipZap("zzipzopzap"));// "zzpzpzp"
    }
}