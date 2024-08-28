class Solution {
    public static void thisPlace(List<Integer> list, int m, int n, int[][] matrix){
        int i =list.get(0);
        int j = list.get(1);
        for(int row=i+1; row<m; row++){
            matrix[row][j] = 0;
        }
        for(int row=i-1; row>=0; row--){
            matrix[row][j] = 0;
        }
        for(int col = j+1; col<n; col++){
            matrix[i][col] = 0;
        }
        for(int col = j-1; col>=0; col--){
            matrix[i][col] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                   List<Integer> temp = new ArrayList<>();
                   temp.add(i);
                   temp.add(j);
                   list.add(temp);
                }
            }
        }
        for(int i=0; i<list.size(); i++){
            thisPlace(list.get(i), m, n, matrix);
        }
    }
}