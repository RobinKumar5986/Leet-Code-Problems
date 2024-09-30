class CustomStack {
    int[] stk;
    int ind = -1;
    public CustomStack(int maxSize) {
        stk = new int[maxSize];
    }
    
    public void push(int x) {
        if(ind + 1 <= stk.length -1){
            stk[++ind] = x;
        }
    }
    
    public int pop() {
        int v = -1;
        if(ind >= 0 ){
            v = stk[ind];
            ind --;
        }
        return v;
    }
    
    public void increment(int k, int val) {
        if( k >= stk.length){
            for(int i = 0 ; i<stk.length ; i++){
                stk[i] += val;
            }
        }else{
            for(int i = 0; i < k ;i++){
                stk[i] += val;
            }
        }
    }
}
