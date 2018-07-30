package techgig2018;


import java.util.Scanner;

class Node {
    int data;
    Node l, r;

    public Node(int data) {
        this.data = data;
        l = r = null;
    }
}
public class TreeQuestion {

    Node root;

    void Node(int arr[], int i, Node tree[]) {
        if (tree[i] != null)
            return;
        tree[i] = new Node(i);
        if (arr[i] == -1) {
            root = tree[i];
            return;
        }
        if (tree[arr[i]] == null) {
            Node(arr, arr[i], tree);
        }
        Node p = tree[arr[i]];
        if (p.l == null) {
            p.l = tree[i];
        } else {
            p.r = tree[i];
        }
    }

    Node Tree(int arr[]) {
        int n = arr.length;
        Node[] newarr = new Node[n];
        for (int i = 0; i < n; i++) {
            newarr[i] = null;
        }
        for (int i = 0; i < n; i++) {
            Node(arr, i, newarr);
        }
        return root;
    }

    Node deleteTree(Node root, int delNode) {
        if (null == root || root.data == delNode) {
            return null;
        }
        root.l = deleteTree(root.l, delNode);
        root.r = deleteTree(root.r, delNode);
        return root;
    }

    int getLeafCount(Node node) {
        if (node == null)
            return 0;
        if (node.l == null && node.r == null)
            return 1;
        else
            return getLeafCount(node.l) + getLeafCount(node.r);
    }

    public static void main(String[] args) {

        TreeQuestion tree = new TreeQuestion();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr [] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        Node node = tree.Tree(arr);

        int delNode = s.nextInt();

        if (delNode == 0) {
            System.out.println(0);
        } else {
            tree.deleteTree(node, delNode);
            System.out.print(tree.getLeafCount(node));
        }
    }
}
