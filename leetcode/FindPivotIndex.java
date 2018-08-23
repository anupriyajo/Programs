package leetcode;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int s = 0, ls = 0;
        for (int i : nums) s += i;
        for (int i=0;i<nums.length;i++)
            if (s - nums[i] - ls == ls) return i;
            else ls+=nums[i];
        return -1;
    }
}
