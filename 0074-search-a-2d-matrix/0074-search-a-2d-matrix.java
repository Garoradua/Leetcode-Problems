class Solution {
    public static boolean findInThisRow(int[][] matrix, int j, int m, int n, int target){
            for(int k=0; k<n; k++){
                if(matrix[j][k]==target) return true;
            }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            if(matrix[i][n-1]>=target){
                return findInThisRow(matrix, i, m, n, target);
            }
        }
        return false;
    }
}