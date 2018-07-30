package leetcode;

public class CountandSay {
    public static void main(String[] args) {
        countAndSay(5);
    }
    public static String countAndSay(int n) {
        String x ="1";
        for(int i=2;i<=n;i++){
            x= analyseint(x);
        }
        return x;
    }
    public static String analyseint(String x){

        StringBuilder sb =new StringBuilder();
        int count =1;
        char dig = x.charAt(0);
        char lastdig= dig;
        for(int i =1 ;i< x.length();i++ ){
            dig = x.charAt(i);
            if(lastdig == dig){
                count++;
            }else {
                sb.append(count).append(lastdig);
                count = 1;
                lastdig = dig;
            }
        }
        if(count>0) sb.append(count).append(dig);

        return sb.toString();
    }
}
