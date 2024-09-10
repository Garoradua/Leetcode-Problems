class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int i=0, j=0;

        while(i<mat.length && j<mat[0].length){
            if(j+1 <mat[0].length && mat[i][j+1]>mat[i][j]) j++;
            else if(i+1 < mat.length && mat[i+1][j]>mat[i][j]) i++;
            else if(i-1 >=0 && mat[i-1][j] > mat[i][j]) i--;
            else if(j-1 >=0 && mat[i][j-1] > mat[i][j]) j--;
            else{
                return new int[]{i,j};
            }
        }
        return new int[]{-1};
    }
}