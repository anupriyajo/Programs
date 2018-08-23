package leetcode;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] A = {1, 2, 5};
        int B[] = {2, 4};
        int[] ints = fairCandySwap(A, B);
        System.out.println(ints[0] + " " + ints[1]);
    }

    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] ints = new int[2];
        int sa = 0, sb = 0;
        for (int i : A) sa += i;
        for (int i : B) sb += i;
        Set<Integer> set = new HashSet<>();
        for (int i : B) set.add(i);
        int del = (sb - sa) / 2;
        for (int i : A)
            if (set.contains(del + i)) {
                ints[0] = i;
                ints[1] = del + i;
            }
        return ints;
    }
}
