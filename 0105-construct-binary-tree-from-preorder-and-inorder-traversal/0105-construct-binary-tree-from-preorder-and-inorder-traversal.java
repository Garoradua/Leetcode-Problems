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
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return findTree(preorder, inorder, 0, inorder.length-1 , map);
        
    }

    public TreeNode findTree(int[] preorder, int[] inorder, int si, int ei, Map<Integer, Integer> map){

        if(si > ei) return null;

        TreeNode root = new TreeNode(preorder[preIndex++]);
        int index = 0;
        index = map.get(root.val);

        root.left = findTree(preorder, inorder, si, index-1, map );
        root.right =  findTree(preorder, inorder, index+1, ei, map);

        return root;
    }
}