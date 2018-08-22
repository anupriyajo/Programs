package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob. hIt, baLl";
        String banned  []= {"bob", "hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph += ".";
        Set<String> ban = new HashSet<>();
        HashMap<String, Integer>  hm = new HashMap<>();
        for(String s: banned)
            ban.add(s);
        StringBuilder sb = new StringBuilder();
        String ans = "";
        for(char c : paragraph.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(c);
            }else if(sb.length()>0){
                String ss = sb.toString().toLowerCase();
                if(!ban.contains(ss)) {
                    hm.put(ss, hm.getOrDefault(ss, 0) + 1);
                    if(hm.get(ss)>hm.getOrDefault(ans, 0)) ans= ss;
                }
                sb = new StringBuilder();
            }
        }
        return ans;
    }

}
