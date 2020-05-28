package techgig2020;

import java.util.*;

public class Solution2 {
    /**
      1
      10
     3 6 7 5 3 5 6 2 9 1
     2 7 0 9 3 6 0 6 2 6
     * @param args 7
     */
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int i=0;i<testCases;i++){
            int fights = in.nextInt();
            ArrayList<Long> teamA = new ArrayList<>();
            ArrayList<Long> teamB = new ArrayList<>();
            for(int a=0;a< fights;a++){
                teamA.add(in.nextLong());
            }
            for(int b=0;b< fights;b++){
                teamB.add(in.nextLong());
            }
            int win =0;
            Collections.sort(teamA);
            Collections.sort(teamB);
            for(int b = 0;b < fights; b++){
                long min =0; int index =-1;
                for(int a = 0;a < teamA.size(); a++){
                    if(teamA.get(a)>teamB.get(b)){
                        if(min == 0){
                            min = teamA.get(a);
                            index = a;
                        }else if(teamA.get(a)<min){
                            min = teamA.get(a);
                            index =a;
                        }
                    }
                }
                if(min !=0){
                    teamA.remove(index);
                    win++;
                }
            }
            System.out.println(win);
        }
    }
}
