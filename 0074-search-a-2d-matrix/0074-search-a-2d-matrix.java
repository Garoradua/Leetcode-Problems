class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        for(int i=0; i<rowLength; i++){
            if(target <= matrix[i][colLength-1]){
               return findInRow(i, colLength, matrix, target);
            }
        }

        return false;
    }
    public boolean findInRow(int row, int colLength, int[][] matrix, int target){
        for(int i=colLength-1; i>=0; i--){
            if(matrix[row][i]==target) return true;
        }

        return false;
    }
}