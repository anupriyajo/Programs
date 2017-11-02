package leetcode;

public class LongestPalindromicSubstring {
    int len;
    int start;

    public static void main(String[] args) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        //System.out.println(l.longestPalindrome("babad"));

        System.out.println(l.longestPalindrome("cbbd"));
    }

    private String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            longestPalindromeHelper(s, i, i);
            longestPalindromeHelper(s, i, i + 1);
        }
        return s.substring(start, start + len);
    }

    private void longestPalindromeHelper(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            if (len < j - i + 1) {
                len = j - i + 1;
                start = i;
            }
            i--;
            j++;
        }
    }
}
