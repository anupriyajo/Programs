package leetcode;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println();
    }

    public int guessNumber(int n) {
        int start = 1, end = n, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            int g = -1;//guess(mid);
            if (g == 0) return mid;
            else if (g < 0) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
