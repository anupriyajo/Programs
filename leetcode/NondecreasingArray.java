package leetcode;

public class NondecreasingArray {
    public static void main(String[] args) {
        checkPossibility(new int [] {4,2,1});
    }
    public static boolean checkPossibility(int[] nums) {
        boolean flag = false;
        for(int i=0;i<=nums.length-2;i++){
            if(nums[i]>nums[i+1] ){
                if(flag) return false;
                else flag = true;
            }
        }
        return true;
    }
}
