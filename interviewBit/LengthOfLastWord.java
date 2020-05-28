package interviewBit;

public class LengthOfLastWord {
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("A man, a plan, a canal: Panama"));
    }
    public static int lengthOfLastWord(final String A) {
        int len;
        int end = A.length()-1;
        int start = end;
        while (start>=0 && A.charAt(start)==' ') start--;
        end = start;
        while (start>=0 && A.charAt(start)!=' ') start--;
        len = end-start;
        return len;
    }
}
