class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> temp;

    public MyQueue() {
        stack=new Stack<>();
        temp=new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    public int pop() {
        int t=0;
        while(!stack.isEmpty()){
            t=stack.pop();
            System.out.println(t);
            if(stack.size()>=1){
                System.out.println("YES");
                temp.push(t);
            }
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return t;
    }
    
    public int peek() {
        int peek=0;
        temp.clear();
        while(!stack.isEmpty()){
            peek=stack.pop();
            temp.push(peek);
        }
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        if(stack.isEmpty()) return true;
        return false;
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