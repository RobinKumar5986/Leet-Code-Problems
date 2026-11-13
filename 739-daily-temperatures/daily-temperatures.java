class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[temp.length];
        for(int i = 0 ; i < temp.length; i++){
            int num = temp[i];
            while(!stk.isEmpty() && temp[stk.peek()] < num){
                int ind = stk.pop();
                ans[ind] = i - ind;
            }
            stk.push(i);
        }
        return ans;
    }
}