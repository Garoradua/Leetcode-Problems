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
    int k;
    int value = 0;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        inOrderTraversal(root);
        return value;
    }

    public void inOrderTraversal(TreeNode root){
        if(root==null) return;
        inOrderTraversal(root.left);
        k--;
        if(k==0){
            value = root.val;
            return;
        }
        inOrderTraversal(root.right);
    }
}