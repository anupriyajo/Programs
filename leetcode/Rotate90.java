package leetcode;

public class Rotate90 {
    public static void main(String args[]) {
        int a[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        //printArr(a);
        a = rotateMatrix(a);
        //printArr(a);

    }

    private static int[][] rotateMatrix(int[][] a) {
        int length = a.length;
        for (int x = 0; x < 1; x++) {
            for (int y = x; y < length - x - 1; y++) {
                System.out.println("X: " + x + "Y: " + y);
                int tmp = a[x][y];//save top
                a[x][y] = a[length - 1 - y][x];// left to top
                //a[length - 1 - y][x] = a[length - 1 - x][length - 1 - y];//bottom to left
                //a[length - 1 - x][length - 1 - y] = a[y][x];//right to bottom
                //a[y][x] = tmp; // top to right
                printArr(a);
            }
        }
        return a;
    }

    private static void printArr(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
