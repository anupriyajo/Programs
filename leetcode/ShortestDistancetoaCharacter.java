package leetcode;

public class ShortestDistancetoaCharacter {
    public static void main(String[] args) {
        int [] a = shortestToChar("loveleetcode",'e');
    }
    public static int[] shortestToChar(String S, char C) {
        int l = S.length();
        int pos = -l;
        int res [] = new int [l];
        for(int i=0;i<l;i++){
            if(S.charAt(i) == C){
                pos = i;
            }
            res[i] = i-pos;
        }
        for(int i=l-1;i>=0;i--){
            if(S.charAt(i) == C){
                pos = i;
            }
            res[i] = Math.min(res[i], Math.abs(i-pos));
        }
        return res;
    }
}
