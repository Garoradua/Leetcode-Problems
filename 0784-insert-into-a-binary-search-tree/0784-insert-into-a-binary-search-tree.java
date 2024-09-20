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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = new TreeNode(val);
        if(root==null) return temp;
        TreeNode curr = root;
        TreeNode previous = null;
            while(curr!=null){
                previous = curr;
                if(curr.val > val){
                    curr = curr.left;
                }else{
                    curr = curr.right;
                }
            }
            if(val > previous.val) previous.right = temp;
            else previous.left = temp;
            return root;
    }
}