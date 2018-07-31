package leetcode;

import java.util.HashMap;

public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
    System.out.println(firstUniqChar("leetcode"));
    }
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap();
        int l = s.length();
        for(int i=0;i< l;i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)) hm.put(c,i*-1);
            else hm.put(c,i);
        }
        for(char x:hm.keySet()){
            if(hm.get(x)>=0) return x;
        }
        return -1;
    }
}
