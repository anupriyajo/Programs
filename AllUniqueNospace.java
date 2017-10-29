import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllUniqueNospace {
    public static void main (String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "qwertu";//br.readLine();
        if(checkUniqueNoSpace(s)) System.out.println("Yes unique");
        else System.out.println("No unique");
    }

    private static boolean checkUniqueNoSpace(String s) {
        int check =0;

        for(int i=0;i<s.length();i++){
            int bitAtindex = s.charAt(i)-'a';
            if((check & (1<<bitAtindex))>0) return false;
            check = check | (1<<bitAtindex);
        }
        return true;
    }
}
