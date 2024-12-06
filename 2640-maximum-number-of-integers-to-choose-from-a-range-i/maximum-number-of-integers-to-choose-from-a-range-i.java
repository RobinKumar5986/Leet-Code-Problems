class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int ans = 0;
        int sum = 0;
        boolean[] ok = new boolean[10001];
        for(int ele : banned)
            ok[ele] = true;
        for(int i = 1 ; i<= n ;i++){
            if(!ok[i]){
                if(sum+i <= maxSum){
                    ans++;
                    sum+=i;
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}