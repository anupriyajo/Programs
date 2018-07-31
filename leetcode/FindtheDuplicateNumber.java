package leetcode;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int [] {1,3,4,2,2}));
    }
    public static int findDuplicate(int[] nums) {
        int l = nums.length-1;
        int s = l*(l+1)/2;
        for(int i=0;i<=l;i++){
            s-=nums[i];
        }
        return s*-1;
    }
}
