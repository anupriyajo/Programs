package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public  static void main(String args) {
        System.out.println("{[]}");
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (char ch : s.toCharArray()) {
            if (ch == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if(ch == '}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            } else if (ch == ']' && !stack.empty() && stack.peek() == '['){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.size() == 0;
    }
}
