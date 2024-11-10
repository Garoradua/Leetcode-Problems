/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
      if(root==null) return "X";
      String left = serialize(root.left);
      String right =  serialize(root.right);

      return root.val +","+left +","+right;

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>();
        String arr[] = data.split(",");
        for(int i=0; i<arr.length; i++){
            q.add(arr[i]);
        }
        return createTree(q);
    }

    public TreeNode createTree(Queue<String> q){
        if(q.size()==0) return null;
        String peek = q.poll();
        if(peek.equals("X")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(peek));
        root.left = createTree(q);
        root.right = createTree(q);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));