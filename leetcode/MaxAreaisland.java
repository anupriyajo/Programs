package leetcode;

public class MaxAreaisland {
    public static void main(String args[]) {
        int a[][] = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        System.out.println(maxAreaOfIsland(a));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        int seen[][] = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                res = Math.max(res, dfs(i, j, grid, seen));
            }
        }
        return res;
    }

    public static int dfs(int r, int c, int[][] grid, int[][] seen) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || seen[r][c] == 1 || grid[r][c] == 0) {
            return 0;
        }
        seen[r][c] = 1;
        return (1 + dfs(r + 1, c, grid, seen) + dfs(r - 1, c, grid, seen) + dfs(r, c + 1, grid, seen) + dfs(r, c - 1, grid, seen));
    }
}
