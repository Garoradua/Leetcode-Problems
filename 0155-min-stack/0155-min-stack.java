class MinStack {
    Stack<Integer> stack;
    public MinStack() {
        stack  = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i<stack.size(); i++){
            minimum = Math.min(minimum, stack.get(i));
        }
        return minimum;
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