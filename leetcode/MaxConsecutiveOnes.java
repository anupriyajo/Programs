package leetcode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max_far =0, max_here=0, start =-1,end =-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(start ==-1){
                    start =i;
                    end =i;
                }
            }
            if(start !=-1 && nums[i]==0){
                end = i-1;
                max_here = end-start+1;
                max_far = Math.max(max_far, max_here);
                start = i+1;
            }
        }
        if(start !=-1 && nums[nums.length-1]==1){
            max_here = nums.length-1-start+1;
            max_far = Math.max(max_far, max_here);
        }
        return max_far;
    }
}
