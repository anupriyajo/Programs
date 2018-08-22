package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("."));
    }
    public static boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int start = 0, end = s.length()-1;
        while(start<= end){
            if (!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            else if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }else {
                start++;
                end--;
            }
        }
        return true;
    }
}
