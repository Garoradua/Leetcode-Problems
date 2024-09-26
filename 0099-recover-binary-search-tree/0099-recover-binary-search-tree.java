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
    public void recoverTree(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        inOrderTraversal(root, list);
        TreeNode prev = null;
        TreeNode second = null;

        for(int i=1; i<list.size(); i++){
            if(list.get(i-1).val > list.get(i).val){
                if(prev==null) prev = list.get(i-1);
                second = list.get(i);
            }
        }
        int data = prev.val;
        prev.val = second.val;
        second.val = data;
    }
    public void inOrderTraversal(TreeNode root, ArrayList<TreeNode> list){
        if(root==null) return;
        inOrderTraversal(root.left, list);
        list.add(root);
        inOrderTraversal(root.right, list);
    }
}