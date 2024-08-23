class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] result = new int[ matrix.length * matrix[0].length ];
        int h =0;
        for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                    result[h] = matrix[i][j];
                    h++;
                }
            }
            Arrays.sort(result);
        return result[k-1];
    }
}