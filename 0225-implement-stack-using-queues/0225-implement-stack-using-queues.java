class MyStack {
    Queue<Integer> q;
    int ele=0;
    public MyStack() {
        q=new LinkedList<>();
    }
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int size=q.size();
        while(size>0){
            ele=q.remove();
            if(size>1)
                q.add(ele);
            size--;
        }
        return ele;

    }
    
    public int top() {
        int size=q.size();
        while(size>0){
        
            ele=q.remove();
            q.add(ele);
            size--;
        }

        return ele;
    }
    
    public boolean empty() {
        System.out.println(q.size());
    
        if(q.size()==0) return true;
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