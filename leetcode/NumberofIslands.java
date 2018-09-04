package leetcode;

public class NumberofIslands {
    public static void main(String[] args) {
        char [][] land = new char[0][0];
                /*{{'1', '1', '0', '0', '0'},
        {'0', '1', '0', '0', '1'},
        {'1', '0', '0', '1', '1'},
        {'0', '0', '0', '0', '0'},
        {'1', '0', '1', '0', '1'}};*/
        System.out.println(numIslands(land));
    }
    private static int numIslands(char[][] grid) {
        if(grid== null  || grid.length ==0) return 0;
        int count=0;
        int [][] visited = new int [grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++)
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    dfs(visited, grid, i,j);
                    count++;
                }
        }
        return count;
    }

    private static boolean isSafe(int r, int c, int [][] visited, char [][] grid){
        if(r>=0 && r< visited.length&& c>=0  && c< visited[0].length && grid[r][c]=='1' && visited[r][c]==0 )
            return true;
        return false;
    }

    private static void dfs(int[][] visited, char[][] grid, int r, int c) {
        int row [] = new int[]{-1,0,1,0};
        int col [] = new int[]{0, 1, 0, -1};
        visited[r][c]=1;
        for(int k=0;k<4;k++)
            if(isSafe(r+row[k],c+col[k], visited, grid))
                dfs(visited, grid, r+row[k], c+col[k]);
    }
}
