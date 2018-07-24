package leetcode;

import java.util.HashMap;

public class NextGreaterElement {
    public static void main(String[] args) {
        int a[] = {4, 1, 2};
        int b[] = {1, 3, 4, 2};
        int[] c = nextGreaterElement(a, b);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums2.length; i++) {
            hm.put(nums2[i], i);
        }
        int max = nums2[nums2.length - 1];
        nums2[nums2.length - 1] = -1;
        for (int i = nums2.length - 2; i >= 0; i--) {
            if (max > nums2[i]) {
                nums2[i] = max;
            } else if (max < nums2[i]) {
                max = nums2[i];
                nums2[i] = -1;
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nums2[hm.get(nums1[i])];
        }
        return nums1;
    }
}
