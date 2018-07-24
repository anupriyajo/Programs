package leetcode;

import java.util.Stack;

public class BaseballGame {
    public static void main(String args[]) {
        String s[] = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(s));
    }

    public static int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            char ch = ops[i].charAt(0);
            switch (ch) {
                case '+':
                    int a = s.pop();
                    int next = a + s.peek();
                    sum += next;
                    s.push(a);
                    s.push(next);
                    break;
                case 'C':
                    a = s.pop();
                    sum -= a;
                    break;
                case 'D':
                    a = s.peek() * 2;
                    sum += a;
                    s.push(a);
                    break;
                default:
                    a = Integer.parseInt(ops[i]);
                    s.push(a);
                    sum += a;
            }
        }
        return sum;
    }
}
