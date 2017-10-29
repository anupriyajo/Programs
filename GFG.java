import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        for(int i =0 ; i<t ; i++){
            String str = s.nextLine();
            int countArr [] = new int[27];
            for(int j =0;j< str.length();j++){
                countArr[str.charAt(j)]++;
            }
           // return t;
        }
    }
}