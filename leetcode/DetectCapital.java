package leetcode;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("ABC"));//t
        System.out.println(detectCapitalUse("abc"));//t
        System.out.println(detectCapitalUse("Abc"));//t
        System.out.println(detectCapitalUse("AB"));//t
        System.out.println(detectCapitalUse("ab"));//t
        System.out.println(detectCapitalUse("Ab"));//t
        System.out.println(detectCapitalUse("A"));//t
        System.out.println(detectCapitalUse("a"));//t
        System.out.println(detectCapitalUse("aBc"));//f
        System.out.println(detectCapitalUse("aB"));//f
    }

    public static boolean detectCapitalUse(String word) {
        int l = word.length();
        char[] w = word.toCharArray();
        if (l == 1) return true;
        else if (l >= 2) {
            if (Character.isLowerCase(word.charAt(0)) || (Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(1)))) {
                for (int i = 1; i < w.length; i++) {
                    if (Character.isUpperCase(w[i])) return false;
                }
            } else {
                for (int i = 2; i < w.length; i++) {
                    if (Character.isLowerCase(w[i])) return false;
                }
            }
        }
        return true;
    }
}
