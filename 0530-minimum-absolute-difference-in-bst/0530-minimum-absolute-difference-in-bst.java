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
    int minimum = Integer.MAX_VALUE;
    TreeNode previous = null;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minimum;
    }

    public void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        if(previous!=null) minimum = Math.min(minimum, root.val-previous.val);
        previous = root;
        inOrder(root.right);
    }
}