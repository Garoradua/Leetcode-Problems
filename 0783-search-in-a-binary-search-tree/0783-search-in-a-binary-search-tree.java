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
    public TreeNode searchBST(TreeNode root, int val) {
        List<TreeNode> list = new ArrayList<>();
        inOrderTraversal(root, list);
        int left = 0;
        int right = list.size()-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(list.get(mid).val==val) return list.get(mid);
            else if(list.get(mid).val > val) right = mid-1;
            else left = mid+1;
        }
        return null;
    }
    public void inOrderTraversal(TreeNode root, List<TreeNode> list){
        if(root==null) return ;
        inOrderTraversal(root.left, list);
        list.add(root);
        inOrderTraversal(root.right, list);
    }
}