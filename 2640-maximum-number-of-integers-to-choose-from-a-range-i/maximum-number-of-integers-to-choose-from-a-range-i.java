class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int ans = 0;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int ele : banned)
            set.add(ele);
        
        for(int i = 1 ; i<= n ;i++){
            if(!set.contains(i)){
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