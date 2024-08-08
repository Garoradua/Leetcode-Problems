class Solution {

    public static int columnCount(int[][] arr, int row, int column){
        int count = 0;
        for(int i=0; i<column; i++){
            int start = 0;
            int end = row-1;
            while(start <= end){
                if(arr[start++][i] != arr[end--][i]) count++;
            }
        }
        return count;
    }

    public static int rowCount(int[][] arr, int row, int column){
        int count = 0;
        for(int i=0; i<row; i++){
            int start = 0;
            int end = column-1;
            while(start <= end){
                if(arr[i][start++] != arr[i][end--]) count++;
            }
        }
        return count;
    }
    public int minFlips(int[][] grid) {
        int countRow = 0;
        int countColumn = 0;
        int[][] arr = grid;
        int row = arr.length;
        int column  = arr[0].length;
        if(row==1 || column == 1) {
            System.out.println(row + " " + column);
            return 0;
        }
        countColumn = columnCount(arr, row, column);
        countRow = rowCount(arr, row, column);

        return Math.min(countColumn, countRow);
    }
}