package leetcode;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }
    public static int binaryGap(int N) {
        int gap_here =0 ,max_gap=0, last_pos=-1, step =0;
        while(N>0){
            int rem =N%2;
            if(rem == 1){
                gap_here = last_pos==-1? 0: step- last_pos;
                last_pos = step;
                max_gap = Math.max(max_gap, gap_here);
            }
            N/=2;
            step++;
        }
        return max_gap;
    }
}
