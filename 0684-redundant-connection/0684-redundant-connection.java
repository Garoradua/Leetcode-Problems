class Solution {
    int[] parent;
    int[] size;
    int components;
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        components = n;
        size = new int[n];
        parent = new int[n];
        for(int i=0; i<n; i++){
            size[i] = 1;
            parent[i] = i;
        }
        for(int i=0; i<n; i++){
            int[] result = edges[i];
            if(applyUnion(result[0]-1, result[1]-1)==true) return edges[i];
        }
        return new int[2];
    }
    public int findParent(int node){
        if(node == parent[node]) return node;
        parent[node] = findParent(parent[node]);
        return parent[node];
    }
    public boolean applyUnion(int node1, int node2){
        int parentNode1 = findParent(node1);
         int parentNode2 = findParent(node2);

         if(parentNode1==parentNode2) return true;
         components--;

         if(size[parentNode1] > size[parentNode2]) {
            parent[parentNode2] = parentNode1;
            size[parentNode1] += size[parentNode2];
         }else  if(size[parentNode2] >= size[parentNode1]) {
            parent[parentNode1] = parentNode2;
            size[parentNode2] += size[parentNode1];
         }
         return false;
    }
}