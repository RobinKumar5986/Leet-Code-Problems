class MyStack {
    List<Integer> q=new ArrayList<>();
    int ind=-1;
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(++ind,x);
    }
    
    public int pop() {
        return q.get(ind--);
    }
    
    public int top() {
        return q.get(ind);
    }
    
    public boolean empty() {
        if(ind==-1) return true;
        return false;
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