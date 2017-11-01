package leetcode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String args []){
        int nums []= {2, 7, 11, 15};
        int target = 9;
        int res [] = twoSum(nums,target);
        System.out.println(res[0]+" "+ res[1]);
    }
    private static int[] twoSum(int[] nums, int target) {
        int res [] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i <nums.length; i++ ){
            if(hm.containsKey(target-nums[i])){
                res[1] = i;
                res[0] = hm.get(target-nums[i]);
            }else {
                hm.put(nums[i],i);
            }
        }
        return res;
    }
}
