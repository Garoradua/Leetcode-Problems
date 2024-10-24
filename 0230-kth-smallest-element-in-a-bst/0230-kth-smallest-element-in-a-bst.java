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
    public int kthSmallest(TreeNode root, int k) {
        int[] kth = {k};
        int[] val = {-1};
        return inOrderTraversal(root, kth, val);
    }

    public int inOrderTraversal(TreeNode root, int[] kth, int[] val){
        if(root==null) return -1;
        if(inOrderTraversal(root.left, kth, val)!=-1) return val[0];
        kth[0]--;
        if(kth[0]==0) {
            val[0] = root.val;
            return val[0];
        }
        return inOrderTraversal(root.right, kth, val);
    }
}