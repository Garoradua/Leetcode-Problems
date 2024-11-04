class Solution {
    int m;
    int n;
    int totalGold = 0;
    public int getMaximumGold(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int maxGold = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                totalGold += grid[i][j];
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]!=0){
                    maxGold = Math.max(maxGold, dfs(i, j, grid, visited));
                    if(maxGold==totalGold) return totalGold;
                }  
            }
        }
        return maxGold;
       
    }

    public int dfs(int row, int col, int[][] grid, boolean[][] visited){
        if(row>=m || row<0 || col<0 || col>=n || visited[row][col] || grid[row][col] == 0){
            return 0;
        }

        visited[row][col]=true;
        int[][] allDir = new int[][]{{-1,0}, {0, 1}, {1,0}, {0, -1}};
        int maxGold = 0;
        for(int i=0; i<4; i++){
            int nextRow = row + allDir[i][0];
            int nextCol = col + allDir[i][1];
            maxGold = Math.max(maxGold, dfs(nextRow, nextCol, grid, visited));
        }
        visited[row][col]=false;
        return maxGold + grid[row][col];
    }
}