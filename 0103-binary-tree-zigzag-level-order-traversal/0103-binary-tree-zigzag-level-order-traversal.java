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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        if(root==null) return finalList;

        s1.push(root);

        while(!s1.empty() || !s2.isEmpty()){
            if(!s1.isEmpty()){
            while(!s1.isEmpty()){
                TreeNode curr = s1.pop();
                // temp = new ArrayList<>();
                temp.add(curr.val);
                if(curr.left!=null) s2.push(curr.left);
                if(curr.right !=null) s2.add(curr.right);
            }
            finalList.add(new ArrayList<>(temp));
            temp = new ArrayList<>();
            }

            if(!s2.isEmpty()){
            while(!s2.isEmpty()){
                TreeNode curr = s2.pop();
                // temp = new ArrayList<>();
                temp.add(curr.val);
                if(curr.right !=null) s1.add(curr.right);
                if(curr.left!=null) s1.push(curr.left);
            }
            finalList.add(new ArrayList<>(temp));
            temp = new ArrayList<>();
            }
        }
        return finalList;
    }
}