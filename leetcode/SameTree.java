package leetcode;

public class SameTree {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        TreeNode f = new TreeNode(1);
        TreeNode g = new TreeNode(2);
        TreeNode h = new TreeNode(3);
        TreeNode i = new TreeNode(4);
        TreeNode j = new TreeNode(5);
        f.left = g;
        f.right = h;
        g.left = i;
        g.right = j;
        System.out.println(isSameTree(a, f));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) return true;
        return false;
    }
}
