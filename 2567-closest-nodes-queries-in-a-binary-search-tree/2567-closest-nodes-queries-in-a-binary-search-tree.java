/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        List<Integer> list = new ArrayList<>();
        inOrderTraversal(root, list);
        for(int i=0; i<queries.size(); i++){
            int small = findSmaller(queries.get(i), list);
            int larger = findLarger(queries.get(i), list);
            result.add(Arrays.asList(small,larger));
        }
        return result;
    }
    public int findSmaller(int number, List<Integer> list){
            int l = 0;
            int r = list.size()-1;
            int small= -1;
            while(l<=r){
                int mid = l + (r-l)/2;

                if(list.get(mid)==number){
                    return number;
                }
                else if(list.get(mid) > number){
                    r = mid-1;
                }else{
                    small = list.get(mid);
                    l = mid+1;
                }
            }
            return small;
    }
    public int findLarger(int number, List<Integer> list){
            int l = 0;
            int r = list.size()-1;
            int larger = -1;
            while(l<=r){
                int mid = l + (r-l)/2;

                if(list.get(mid)==number){
                    return number;
                }
                else if(list.get(mid) > number){
                    larger = list.get(mid);
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }
            return larger;
    }
    public void inOrderTraversal(TreeNode root, List<Integer> list){
        if(root==null) return;
        inOrderTraversal(root.left, list); 
        list.add(root.val);
        inOrderTraversal(root.right, list); 
    }
}