class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int maximumGold = 0;
        int totalGold = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                totalGold += grid[i][j];
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]!=0)
                maximumGold = Math.max(findMaxGoldPath(grid, i, j, visited), maximumGold);
                if(totalGold == maximumGold) return totalGold;
            }
        }
        return maximumGold;
        
    }

    public static int findMaxGoldPath(int[][] grid, int i, int j, boolean[][] visited){
       
       if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || visited[i][j] || grid[i][j]==0) return 0;
        int maxGold = 0;
        visited[i][j] = true;
        int[][] direction = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        for(int dir=0; dir<direction.length; dir++){
            maxGold = Math.max(findMaxGoldPath(grid, i+direction[dir][0], j+direction[dir][1], visited), maxGold);
        }
        visited[i][j] = false;
        return maxGold + grid[i][j];
    }
}