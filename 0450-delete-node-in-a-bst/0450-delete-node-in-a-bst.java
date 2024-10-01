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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        return deleteTree(root, key);
    }
    public TreeNode deleteTree(TreeNode root, int key){
        if(root==null) return root;
        if(root.val > key) root.left = deleteTree(root.left, key);
        else if(root.val < key) root.right = deleteTree(root.right, key);
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{
                TreeNode getNode = getnewNode(root.right);
                root.val = getNode.val;
                root.right = deleteTree(root.right, getNode.val);
            }
        }
        return root;
    }
    public TreeNode getnewNode(TreeNode root){
        TreeNode curr = root;
        while(curr.left!=null) curr = curr.left;
        return curr;
    }
}