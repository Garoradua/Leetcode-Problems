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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        int maxlevel = 0;
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        while(!queue.isEmpty()){
            int size = queue.size();
            level = maxlevel;
            while(size>0){
                TreeNode curr = queue.poll();
                if(maxlevel == level) list.add(curr.val);
                if(curr.right!=null) queue.add(curr.right);
                if(curr.left!=null) queue.add(curr.left);
                size--;
                maxlevel++;
            }
        }
            return list;
    }
}