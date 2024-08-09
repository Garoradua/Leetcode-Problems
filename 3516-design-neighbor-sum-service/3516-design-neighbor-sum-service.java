class NeighborSum {
    int[][] arr;
    int row;
    int column;
    public NeighborSum(int[][] grid) {
        arr = grid;
        row = arr.length;
        column = arr[0].length;
    }
    
    public int adjacentSum(int value) {
        int sum = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(arr[i][j]==value){
                    if(j-1>=0) sum += arr[i][j-1];
                    if(j+1 < column) sum += arr[i][j+1];
                    if(i-1 >=0) sum += arr[i-1][j];
                    if(i+1 < row) sum += arr[i+1][j];
                    break;
                }
            }
        }
        return sum;
    }
    
    public int diagonalSum(int value) {
        int sum = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(arr[i][j]==value){
                    if(j-1>=0 && i-1 >=0) sum += arr[i-1][j-1];
                    if(j+1 < column && i-1 >=0) sum += arr[i-1][j+1];
                    if(i+1 <row && j+1 < column) sum += arr[i+1][j+1];
                    if(i+1 < row && j-1>=0) sum += arr[i+1][j-1];
                    break;
                }
            }
        }
        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */