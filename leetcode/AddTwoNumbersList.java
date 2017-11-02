package leetcode;

public class AddTwoNumbersList {
    public static void main(String[] args) {
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(4);
        a.next = b;
        b.next = c;
        d.next = e;
        e.next = f;
        ListNode g = addTwoNumbers(a, d);
        while (g != null) {
            System.out.println(g.val);
            g = g.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       /* int carry = 0;
        int sum = 0;
        ListNode a = new ListNode(0);
        ListNode b = a;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            b.next = new ListNode(sum % 10);
            b = b.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            sum = l1.val + carry;
            carry = sum / 10;
            b.next = new ListNode(sum % 10);
            b = b.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = l2.val + carry;
            carry = sum / 10;
            b.next = new ListNode(sum % 10);
            b = b.next;
            l2 = l2.next;
        }
        if (carry > 0) {
            b.next = new ListNode(carry);
        }
        return a.next;*/
        int carry = 0;
        int sum = 0;
        ListNode a = new ListNode(0);
        ListNode b = a;
        while (l1 != null || l2 != null) {
            int v1 = (l1 == null ? 0 : l1.val);
            int v2 = (l2 == null ? 0 : l2.val);
            sum = v1 + v2 + carry;
            carry = sum / 10;
            b.next = new ListNode(sum % 10);
            b = b.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (carry > 0) {
            b.next = new ListNode(carry);
        }
        return a.next;
    }
}
