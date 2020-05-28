package interviewBit;

public class ReverseTheString {
    public static void main(String[] args){
        System.out.println(solve("the sky is blue"));
    }
    public static String solve(String A) {
        StringBuilder sb = new StringBuilder();
        int end = A.length()-1;
        int start = end;
        while (start>=0) {
            while (start>=0 && A.charAt(end) == ' '){
                start--;
                end--;
            }
            while (start>=0 && A.charAt(start) != ' ') {
                start--;
            }
            for(int i=start+1;i<=end;i++){
                sb.append(A.charAt(i));
            }
            end=start;
            sb.append(" ");
        }
        //remove last space
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
