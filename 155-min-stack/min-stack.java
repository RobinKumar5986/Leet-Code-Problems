class MinStack {
    Stack<Integer> stk = new Stack<>();
    Stack<Integer> minStk = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        stk.push(value);
        int min = value;
        if(!minStk.isEmpty()){
            min = Math.min(min,minStk.peek());
        }
        minStk.push(min);
    }
    
    public void pop() {
        stk.pop();
        minStk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */