/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        TreeNode curr = root;

        while(curr!=null){
            if((curr.val > p.val && curr.val <q.val )|| (curr.val > q.val && curr.val <p.val)) return curr;
            else if(curr.val == p.val || curr.val==q.val) return curr;
            else if(curr.val > p.val && curr.val > q.val){
                if(curr.left!=null) curr = curr.left;
                else return curr;
            }else if(curr.val < p.val && curr.val < q.val){
                if(curr.right!=null) curr = curr.right;
                else return curr;
            }
        }
        return null;
    }
}