class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < 2 * nums.length; i++){
            int ind = i % nums.length;
            if(stk.isEmpty()){
                stk.push(ind);
            }else{
                while(!stk.isEmpty() && nums[stk.peek()] < nums[ind]){
                    int idx = stk.pop();
                    ans[idx] = nums[ind];
                }
                stk.push(ind);
            }
        }
        return ans;
    }
}