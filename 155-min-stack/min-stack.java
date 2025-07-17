class MinStack {
    Stack<Integer> stk = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
    }
    
    public void push(int val) {
        stk.push(val);
        if(min.isEmpty() || min.peek() > val){
            min.push(val);
        }else{
            min.push(min.peek());
        }
    }
    
    public void pop() {
        stk.pop();
        min.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}