class Solution {
    public int[][] transpose(int[][] matrix) {
        int i = matrix.length;
        int j = matrix[0].length;

        int[][] transposed = new int[j][i];

        for(int row=0; row<i; row++){
            for(int column = 0; column<j; column++){
                transposed[column][row] = matrix[row][column];
            }
        }
        return transposed;
    }
}