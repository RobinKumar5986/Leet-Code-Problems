class MinStack {
    PriorityQueue<Integer> minHeap;
    int[] stk;
    int top;
    public MinStack() {
        this.minHeap = new PriorityQueue<>();
        this.stk = new int[3*10000 + 1];
        this.top = -1;
    }
    
    public void push(int val) {
        top +=1;
        minHeap.offer(val);
        stk[top] = val;

    }
    
    public void pop() {
        minHeap.remove(stk[top]);
        top -= 1;
    }
    
    public int top() {
        return stk[top];
    }
    
    public int getMin() {
        return minHeap.peek();
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