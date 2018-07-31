package leetcode;

import static java.lang.Math.*;

public class LargestTriangleArea {
    public static void main(String[] args) {
        int [][] n = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(largestTriangleArea( n ));
    }
    public static double largestTriangleArea(int[][] points) {
        double max =0;
        int l = points.length;
        for(int i=0;i<l-2;i++)
            for(int j=i+1;j<l-1;j++)
                for(int k =j+1;k<l;k++){
                    double area = abs(points[i][0]*(points[j][1]-points[k][1]) + points[j][0]*(points[k][1]-points[i][1]) + points[k][0]*(points[i][1]-points[j][1]))/2.0;
                    max = max(max,area);
                }
        return max;
    }
}
