package leetcode;

import java.util.Collections;
import java.util.HashMap;

public class DegreeofanArray {
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1}));
    }
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> left = new HashMap(),
                right = new HashMap(),
                count = new HashMap();
        for(int i =0;i< nums.length;i++){
            if(!left.containsKey(nums[i])) left.put(nums[i],i);
            right.put(nums[i],i);
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
        }
        int min = nums.length;
        int degree = Collections.max(count.values());
        for(int x: count.keySet()){
            if(count.get(x)==degree) min = Math.min(min, (right.get(x)-left.get(x)+1));
        }
        return min;
    }
}
