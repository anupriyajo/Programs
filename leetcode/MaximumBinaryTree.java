package leetcode;

public class MaximumBinaryTree {
    public static void main(String[] args) {
        int a [] = {3,2,1,6,0,5};
        constructMaximumBinaryTree(a);
    }
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return makeTree(nums, 0, nums.length-1);
    }
    public static TreeNode makeTree(int a [] , int l , int r){
        if(l > r ) return null;
        int max = maxt(a, l , r);
        TreeNode root = new TreeNode(a[max]);
        root.left = makeTree(a, l , max-1);
        root.right = makeTree(a, max+1, r);
        return root;
    }
    public static int maxt(int a [] , int l, int r){
        int max = a[l];
        int index = l;
        for(int i = l;i <= r; i++){
            if(a[i]>max)
            {
                max = a[i];
                index = i;
            }
        }
        return index;
    }
}
