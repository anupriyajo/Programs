package leetcode;

public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        ListNode q = new ListNode(1);
        ListNode w = new ListNode(2);
        ListNode e = new ListNode(3);
        ListNode r = new ListNode(4);
        ListNode t = new ListNode(5);
        ListNode y = new ListNode(6);
        q.next=w;
        w.next=e;
        e.next =r;
        r.next=t;
        t.next=y;
        middleNode(q);
    }
    public static   ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast!= null && fast.next!= null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
