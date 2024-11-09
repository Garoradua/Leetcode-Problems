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
    int maximumPath = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
         pathTraverse(root);
         return maximumPath;
    }

    public int  pathTraverse(TreeNode root){
        if(root==null) return 0;
        int left = Math.max(pathTraverse(root.left), 0);
        int right = Math.max(pathTraverse(root.right), 0);
        int current_path = root.val + left + right;

        maximumPath = Math.max(current_path, maximumPath);

        return root.val + Math.max(left, right);
        
    }
}