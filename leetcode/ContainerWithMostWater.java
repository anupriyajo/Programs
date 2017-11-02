package leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        System.out.println(maxArea(a));
    }

    public static int maxArea(int[] height) {
        int maxVol = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int vol = (j - i) * Math.min(height[i], height[j]);
            maxVol = maxVol < vol ? vol : maxVol;
            if (height[i] < height[j]) i++;
            else j--;
        }
        return maxVol;
    }
}
