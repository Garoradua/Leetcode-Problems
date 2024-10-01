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
        inOrder(root, list);
        TreeNode first = null;
        TreeNode second = null;
        for(int i=1; i<list.size(); i++){
            if(list.get(i).val < list.get(i-1).val) {
                if(first==null) first= list.get(i-1);
                second = list.get(i);
            }
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    public void inOrder(TreeNode root, ArrayList<TreeNode> list){
        if(root==null) return;
         inOrder(root.left, list);
         list.add(root);
          inOrder(root.right, list);
    }
}