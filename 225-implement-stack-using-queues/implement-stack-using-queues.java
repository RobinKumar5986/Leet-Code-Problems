class MyStack {
    Queue<Integer> q = new LinkedList<>();
    int top;

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        top = x;
    }
    
    public int pop() {
        int sz = q.size();
        int last = -1;
        for(int i = 0; i < sz;i++){
            int num = q.remove();
            if( i < sz - 1) {
                q.add(num);
                top = num;
            }else{
                last = num;
            }
        }
        return last;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */