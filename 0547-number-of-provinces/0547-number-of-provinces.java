class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] flag = new boolean[isConnected.length];
        int count = 0;
        for(int i=0; i<isConnected.length; i++){
            if(!flag[i]){
                count++;
                 DFSTraversal(i,isConnected,flag);
            }
        }
        return count;
    }
    public void DFSTraversal(int i, int[][] isConnected, boolean[] flag){
        flag[i] = true;
        for(int j=0; j<isConnected[i].length; j++){
            if(!flag[j] && isConnected[i][j]==1) DFSTraversal(j,isConnected, flag);
        }
    }
}