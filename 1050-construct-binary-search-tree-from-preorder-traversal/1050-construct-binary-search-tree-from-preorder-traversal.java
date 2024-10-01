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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1; i<preorder.length; i++){
            constructTree(root, preorder[i]);
        }
        return root;
    }
    public void constructTree(TreeNode root, int data){
        TreeNode prev = null;
        while(root!=null){
            prev = root;
            if(root.val > data) root = root.left;
            else root = root.right;
        }
        
        if(data > prev.val) prev.right = new TreeNode(data);
        else prev.left = new TreeNode(data);
    }
}