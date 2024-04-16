class MinStack {
    List<Integer> st;
    List<Integer> min;
    public MinStack() {
        st=new ArrayList<>();
        min=new ArrayList<>();
    }
    public void push(int val) {
        st.add(val);
        if(min.isEmpty() || min.get(min.size()-1) > val)
            min.add(val);
        else
            min.add(min.get(min.size()-1));
    }
    
    public void pop() {
        min.remove(min.size()-1);
        st.remove(st.size()-1);
    }
    
    public int top() {
        return st.get(st.size()-1);
    }
    
    public int getMin() {
        return min.get(min.size()-1);
    }
}