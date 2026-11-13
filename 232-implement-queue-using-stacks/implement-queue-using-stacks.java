class MyQueue {
    Stack<Integer> stk = new Stack<>();
    Integer peek = null;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        stk.push(x);
        if(peek == null){
            peek = x;
        }
    }
    
    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while(!stk.isEmpty()){
            temp.push(stk.pop());
        }
        int num = temp.pop();
        if(!temp.isEmpty()){
            peek = temp.pop();
            temp.push(peek);
        }else{
            peek = null;
        }
        while(!temp.isEmpty()){
            stk.push(temp.pop());
        }
        return num;
    }
    
    public int peek() {
        return peek;
    }
    
    public boolean empty() {
        return stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */