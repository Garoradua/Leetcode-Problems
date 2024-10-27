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
    public int amountOfTime(TreeNode root, int start) {
        if(root==null) return 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        TreeNode curr = root;
        makeGraph(curr, -1, map);
        return bfsTraversal(map, start);
    }
    public int bfsTraversal(Map<Integer, List<Integer>> map, int start){
        Queue<Integer> q = new LinkedList<>();
        // boolean[] visited = new boolean[map.size()+1];
        Set<Integer> set = new HashSet<>();
        q.add(start);
        set.add(start);
        int minutes = 0;
        while(!q.isEmpty()){
            int len = q.size();
            while(len>0){
                int data = q.poll();
                for(int num : map.getOrDefault(data, new ArrayList<>())){
                    if(!set.contains(num)){
                        q.add(num);
                        set.add(num);
                    }
                }
                len--;
            }
            if(!q.isEmpty())minutes++;
        }
        return minutes;
    }


    public void makeGraph(TreeNode curr, int parent, Map<Integer, List<Integer>> map){
        if(curr==null) return;
        if(parent!=-1){
            if(!map.containsKey(curr.val)){
                List<Integer> list = new ArrayList<>();
                map.put(curr.val, list);
            }
            map.get(curr.val).add(parent);
        }
        if(curr.left!=null){
            if(!map.containsKey(curr.val)){
                List<Integer> list = new ArrayList<>();
                map.put(curr.val, list);
            }
            map.get(curr.val).add(curr.left.val);
        }
        if(curr.right!=null){
            if(!map.containsKey(curr.val)){
                List<Integer> list = new ArrayList<>();
                map.put(curr.val, list);
            }
            map.get(curr.val).add(curr.right.val);
        }
         makeGraph(curr.left, curr.val, map);
         makeGraph(curr.right, curr.val, map);
    }
}