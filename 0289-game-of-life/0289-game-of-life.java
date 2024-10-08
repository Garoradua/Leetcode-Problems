class Solution {
    public static int findLive(int i, int j, int x, int y, int[][] board){
        int live = 0;
        if(i-1>=0 && board[i-1][j]==1) live++;
        if(j+1<y && board[i][j+1]==1) live++;
        if(i+1 <x && board[i+1][j] ==1 ) live++;
        if(i+1 <x && j+1 <y && board[i+1][j+1]==1) live++; 
        if(j-1 >=0 && board[i][j-1]==1 ) live++;
        if(i+1 <x && j-1>=0 && board[i+1][j-1]==1) live++;
        if(i-1 >=0 && j-1 >=0 && board[i-1][j-1]==1) live++;
        if(i-1 >=0 && j+1 <y && board[i-1][j+1]==1) live++;

        return live;

    }
    public void gameOfLife(int[][] board) {
        int x = board.length;
        int y = board[0].length;
        int[][] clone = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                clone[i][j] = board[i][j];
            }
        }
        int live = 0;
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(clone[i][j] == 0 ){
                    live = findLive(i,j, x, y ,clone);
                    if(live==3) board[i][j] = 1;
                }else{
                     live = findLive(i,j, x, y, clone);
                     if(live < 2 || live > 3) board[i][j] = 0;
                }
            }
        }
    }
}