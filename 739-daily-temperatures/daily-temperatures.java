class Solution {
    
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        int[] stk = new int[temp.length];
        int top = -1;
        for(int i = 0; i < temp.length ; i++){
            while(top >=0 && temp[stk[top]] < temp[i]){
                int ind = stk[top];
                ans[ind] = i - ind;
                top--;
            }
            stk[++top] = i;
        }
        return ans;
    }
}
