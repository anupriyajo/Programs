package techgig2020;
import java.util.Scanner;

public class Solution1 {
    /*
    4
2 5 6 3
20 40 90 50
     */
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int noOfIngrediants = in.nextInt();
        long quantityRequired [] = new long[noOfIngrediants];
        long quantityPresent [] = new long [noOfIngrediants];
        for(int i=0;i< noOfIngrediants;i++){
            quantityRequired[i] = in.nextLong();
        }
        for(int i=0;i< noOfIngrediants;i++){
            quantityPresent[i] = in.nextLong();
        }
        long min = Integer.MAX_VALUE;
        for(int i=0;i< noOfIngrediants;i++){
            min = Math.min(quantityPresent[i]/quantityRequired[i], min);
        }
        System.out.println(min);
    }

}
