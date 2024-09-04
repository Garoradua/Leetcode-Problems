/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return null;
        Stack<Node> q = new Stack<>();
        Node curr = head;
        Node previous = null;
        while(curr!=null){
            if(curr.child!=null){
                if(curr.next!=null)
                    q.add(curr.next);
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
                previous = curr;
                curr = curr.next;
            }else{
                previous  =curr;
                curr = curr.next;
            }
        }
        curr = previous;
        Node next = null;
        while(!q.isEmpty()){
            curr.next = q.pop();
            next = curr.next;
            next.prev = curr;
            curr = curr.next;
            while(curr.next!=null){
            if(curr.child!=null){
                q.add(curr.next);
                curr.next = curr.child;
                curr.child.prev = curr;
            }else{
                curr = curr.next;
            }
        }
        }
        return head;
    }
}