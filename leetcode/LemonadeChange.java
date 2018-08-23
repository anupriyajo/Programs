package leetcode;

public class LemonadeChange {
    public static void main(String[] args) {
        int c[] = {5, 5, 10, 10, 20};
        System.out.println(lemonadeChange(c));
    }

    public static boolean lemonadeChange(int[] bills) {
        int f = 0, t = 0;
        for (int b : bills) {
            if (b == 5) {
                f++;
            } else if (b == 10) {
                if (f > 0) {
                    f--;
                    t++;
                } else {
                    return false;
                }
            } else {
                if (f >= 1 && t >= 1) {
                    f--;
                    t--;
                } else if (f >= 3) {
                    f -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
