class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Stack<Integer> stk = new Stack<>();
        Integer prevTime = null;
        for(String ele : logs){
            String[] log = ele.split(":");
            int ind = Integer.parseInt(log[0]);
            int num = Integer.parseInt(log[2]);
            if(log[1].equals("start")){
                if(!stk.isEmpty()){
                    ans[stk.peek()] += num - prevTime;
                }
                stk.push(ind);
                prevTime = num;
            }else{
                ans[stk.pop()] += num - prevTime + 1;
                prevTime = num+1;
            }
            
        }
        return ans;
    } 
}