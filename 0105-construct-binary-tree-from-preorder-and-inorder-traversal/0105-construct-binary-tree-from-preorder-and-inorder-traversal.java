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
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return findTree(preorder, inorder, 0, inorder.length-1 );
        
    }

    public TreeNode findTree(int[] preorder, int[] inorder, int si, int ei){

        if(si > ei) return null;

        TreeNode root = new TreeNode(preorder[preIndex++]);
        int index = 0;
        for(int i = si; i<=ei; i++){
            if(inorder[i]==root.val){
                index = i;
            }
        }

        root.left = findTree(preorder, inorder, si, index-1 );
        root.right =  findTree(preorder, inorder, index+1, ei);

        return root;
    }
}