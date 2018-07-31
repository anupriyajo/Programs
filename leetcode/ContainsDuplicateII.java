package leetcode;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i< nums.length;i++){
            if(hm.containsKey(nums[i])){
                int pre = hm.get(nums[i]);
                min= Math.min(min, Math.abs(pre-i));
            }
            hm.put(nums[i], i);
        }
        if(min<=k) return true;
        return false;
    }
}
