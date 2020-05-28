package interviewBit;

public class PalindromeString {
    public static void main(String args []){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static int isPalindrome(String A) {
        int start = 0;
        int end = A.length()-1;
        A = A.toLowerCase();
        while(end>start){
            while(start<A.length() && !Character.isLetterOrDigit(A.charAt(start))) start++;
            while(end>=0 && !Character.isLetterOrDigit(A.charAt(end))) end--;
            if(start<A.length() && end>=0){
                if(A.charAt(start) == A.charAt(end)){
                    start++;
                    end--;
                }else{
                    return 0;
                }
            }
        }
        return 1;
    }
}
