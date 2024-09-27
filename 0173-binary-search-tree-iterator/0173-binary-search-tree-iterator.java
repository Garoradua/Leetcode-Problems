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
class BSTIterator {
    ArrayList<Integer> list = new ArrayList<>();
    int i = 0;
    public BSTIterator(TreeNode root) {
        inOrderTraversal(root, list);
    }
    
    public int next() {
        int data =  list.get(i);
        i++;
        return data;
    }
    
    public boolean hasNext() {
        if(i <= list.size()-1) return true;
        return false;
    }
    public void inOrderTraversal(TreeNode root, List<Integer> list){
        if(root==null)return;
        inOrderTraversal(root.left, list);
        list.add(root.val);
        inOrderTraversal(root.right, list);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */