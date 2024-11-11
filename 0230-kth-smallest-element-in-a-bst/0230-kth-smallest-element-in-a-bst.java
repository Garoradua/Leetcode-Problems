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
    int index = 0;
    int value = 0;
    public int kthSmallest(TreeNode root, int k) {
        index = k;
        inOrderTraversal(root);
        return value;
    }

    public void inOrderTraversal(TreeNode root){
        if(root==null) return;
        inOrderTraversal(root.left);
        index--;
        if(index==0){
            value = root.val;
            return;
        }
        inOrderTraversal(root.right);
    }
}