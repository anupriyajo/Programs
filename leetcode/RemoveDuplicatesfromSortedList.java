package leetcode;

public class RemoveDuplicatesfromSortedList {
    public static void main(String[] args) {
        ListNode q = new ListNode(1);
        ListNode w = new ListNode(1);
        ListNode e= new ListNode(2);
        ListNode r = new ListNode(3);
        ListNode t = new ListNode(3);
        q.next = w;
        w.next =e;
        e.next =r;
        r.next =t;
        ListNode y= deleteDuplicates(q);

    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode n = head;
        while((n != null) && (n.next != null) && (n.next.next != null)){
            if(n.val == n.next.val){
                n.next= n.next.next;
            }
            n=n.next;
        }
        if(n!=null && n.next != null && n.val == n.next.val) n.next = null;
        return head;
    }
}
