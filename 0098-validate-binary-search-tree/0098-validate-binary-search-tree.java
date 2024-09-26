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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        long[] previous = {Long.MIN_VALUE};
        boolean first = true;
        return inOrderTraversal(root, list, previous);
        // for(int i=1; i<list.size(); i++){
        //     if(list.get(i-1)>=list.get(i)) return false;
        // }
        // return true;
    }
    public boolean inOrderTraversal(TreeNode root, List<Integer> list, long[] previous){
        if(root==null) return true;;
        if(inOrderTraversal(root.left, list, previous)==false) return false;
        if(root.val <= previous[0]) return false;
            previous[0] = root.val;
        return inOrderTraversal(root.right, list, previous);

    }
}