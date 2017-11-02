package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    private static int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        int rev = 0;
        while (x > 0) {
            if ((long) rev * 10 > Integer.MAX_VALUE) return 0;
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev * sign;
    }
}
