package leetcode;

import java.awt.*;

public class LengthofLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("aaa bbbt"));
    }
    public static int lengthOfLastWord(String s) {
        s= s.trim();
        int length = s.length();
        if(length == 0) return 0;
        int sp = s.lastIndexOf(' ');
            if(sp!=-1){
                return length-sp-1;
            }else{
                return length;
            }
    }
}
