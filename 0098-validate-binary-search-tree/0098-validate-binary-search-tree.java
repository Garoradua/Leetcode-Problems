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
        long value[] = {Long.MIN_VALUE};
        return inOrderTraversal(root, value);

        // for(int i=1; i<list.size(); i++){
        //     if(list.get(i) <= list.get(i-1)) return false;
        // }

        // return true;
    }
    public boolean inOrderTraversal(TreeNode root, long[] value){
        if(root==null) return true;
        if(inOrderTraversal(root.left, value)==false) return false;
        if(root.val <= value[0]) return false;
            value[0] = root.val;
        return inOrderTraversal(root.right, value);
    }
}