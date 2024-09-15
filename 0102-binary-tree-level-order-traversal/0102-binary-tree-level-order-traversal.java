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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root==null) return new ArrayList<>();
         List<Integer> temp;
         List<List<Integer>> result = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            temp = new ArrayList<>();
            for(int i=0; i<size; i++){
                temp.add(q.peek().val);
                TreeNode curr = q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            result.add(temp);
        }
        return result;
    }
}