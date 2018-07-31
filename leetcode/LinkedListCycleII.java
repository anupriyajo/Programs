package leetcode;

public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode q = new ListNode(1);
        detectCycle(q);
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow=head;
        boolean flag = false;
        while(fast!=null && fast.next!= null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) {
                flag=true;
            }
        }
        if(flag){
            slow= head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }else{
            return null;
        }
    }
}
