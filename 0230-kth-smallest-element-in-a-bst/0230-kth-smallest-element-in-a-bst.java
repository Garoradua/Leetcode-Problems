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
    int result;
    int count;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
         inOrderTraversal(root);
         return result;
    }

    public void inOrderTraversal(TreeNode root){
       if(root==null) return;
       inOrderTraversal(root.left);
       count--;
       if(count==0) {
        result = root.val;
        return;
       }
        inOrderTraversal(root.right);
    }
}