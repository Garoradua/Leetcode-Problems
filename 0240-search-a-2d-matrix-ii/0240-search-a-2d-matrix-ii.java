class Solution {
    public static boolean findInRow(int i, int column, int[][] matrix, int target){
        for(int k = column-1; k>=0; k--){
            if(matrix[i][k] == target ) return true;
            else if(matrix[i][k] < target){
                return findInColumn(i, k, target, matrix);
            }
        }
        return false;
    }
    public static boolean findInColumn(int row, int k, int target, int[][] matrix){
        for(int i = row; i<matrix.length; i++){
            if(matrix[i][k] == target) return true;
            else if(matrix[i][k] > target){
                return findInRow(i, k, matrix, target);
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i=0; i<row; i++){
            if(matrix[i][column-1] >= target){
                return findInRow(i, column, matrix, target);
            }
        }
        return false;
    }
}