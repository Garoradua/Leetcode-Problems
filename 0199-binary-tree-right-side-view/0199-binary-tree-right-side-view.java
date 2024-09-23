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
        int level = 0;
        int maxLevel = 0;
        List<Integer> list  = new ArrayList<>();
        if(root==null) return list;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        while(!q.isEmpty()){
            int size = q.size();
            maxLevel = level;
            while(size!=0){
                TreeNode curr = q.poll();
                if(maxLevel == level){
                    list.add(curr.val);
                }
                if(curr.right !=null) q.add(curr.right);
                if(curr.left !=null) q.add(curr.left);
                size--;
                maxLevel++;
            }
            level++;
        }
        return list;
    }
}