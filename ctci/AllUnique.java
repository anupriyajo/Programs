package ctci;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class AllUnique {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(checkUnique(s)) System.out.println("Yes unique");
        else System.out.println("No unique");
    }

    private static boolean checkUnique(String s) {
        if(s.length()>256) return false;
        boolean a []= new boolean[256];
        for(int i=0;i<s.length();i++){
            if(a[s.charAt(i)]) return false;
            a[s.charAt(i)]=true;
        }
        return true;
    }

    public static class AllUniqueNospace {
        public static void main (String args[]) throws IOException {
            String s = "qwertu";
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
}
