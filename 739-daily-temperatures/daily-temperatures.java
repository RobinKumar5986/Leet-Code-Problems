class Solution {
    
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < temp.length ; i++){
            while(!stk.isEmpty() && temp[stk.peek()] < temp[i]){
                int ind = stk.pop();
                ans[ind] = i-ind;
            }
            stk.push(i);
        }
        return ans;
    }
}
