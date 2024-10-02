class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] flag = new boolean[isConnected.length];
        int count = 0;
        for(int i=0; i<isConnected.length; i++){
            if(flag[i]==false){
                count++;
                bfsTraversal(isConnected, flag, i);
            }
        }
        return count;
        
    }
    public void bfsTraversal(int[][] isConnected, boolean[] flag, int i){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        flag[i]=true;
        while(!q.isEmpty()){
           int data = q.poll();
           for(int j=0; j<isConnected[i].length; j++){
            if(isConnected[data][j]==1 && flag[j]==false) {
                q.add(j);
                flag[j]=true;
            }
           }
        }
    }
}