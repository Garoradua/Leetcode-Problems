class Solution {
    int totalFreshOrange = 0;
    int row;
     int col;
     int totalMinutes = 0;
    public int orangesRotting(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==1) totalFreshOrange++;
                else if(grid[i][j]==2){
                    q.add(new int[]{i, j});
                }
            }
        }

        findMinutes(grid, q);
        if(totalFreshOrange==0) return totalMinutes;
        return -1;
    }

    public void findMinutes(int[][] grids, Queue<int[]> q){

        while(!q.isEmpty()){
            int size = q.size();
            int[][] dir = new int[][]{{-1, 0}, {0, 1}, {0, -1}, {1, 0}};
            for(int i=0; i<size; i++){
                int[] oranges = q.poll();
                for(int j=0; j<4; j++){
                    findFresh(oranges[0]+dir[j][0], oranges[1]+dir[j][1], grids, q);
                }
            }
            if(!q.isEmpty())  totalMinutes++;
        }
    }

    public void findFresh(int m, int n, int[][] grid, Queue<int[]> q){
        if(m <0 || n <0 || m >=row || n >=col || grid[m][n]==0 || grid[m][n]==2) return;

        if(grid[m][n]==1) {
            grid[m][n] = 2;
            q.add(new int[]{m, n});
            totalFreshOrange--;
        }

    }
}