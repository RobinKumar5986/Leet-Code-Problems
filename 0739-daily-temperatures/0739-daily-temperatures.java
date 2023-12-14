class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int len=temp.length;
        int ans[]=new int[len];
        Stack<Integer> helper=new Stack<>();

        len=len-1;
        for(int i=len ; i>=0;i--){
            while(!helper.isEmpty() && temp[i]>=temp[helper.peek()] ){
                helper.pop();
            }
            if(!helper.isEmpty()){
                ans[i]= helper.peek() - i;
            }
            helper.push(i);
        }
        return ans;
    }
}