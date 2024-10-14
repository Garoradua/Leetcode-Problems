 class Node{
        int data;
        Node next;
        int minimum;

        Node(int data, int min, Node next){
            this.data = data;
            this.minimum = min;
            this.next = next;
        }
    }
class MinStack {
    Node head;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(head==null){
            head = new Node(val, val, null);
        }else{
            head = new Node(val, Math.min(head.minimum, val), head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head.minimum;
    }

    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */