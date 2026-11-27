class Solution {
    int ans = Integer.MAX_VALUE;
    Map<String,Integer> map = new HashMap<>();
    int dfs(int ind,int sum, int[] coins,int amount){
        String key = ind +":"+sum;
        if(sum == amount)
            return 0;
        if(ind >= coins.length)
            return Integer.MAX_VALUE;
        if(sum > amount)
            return Integer.MAX_VALUE;

        if(map.containsKey(key))
            return map.get(key);

        int min = Integer.MAX_VALUE;
        for(int i = ind; i < coins.length; i++){
            int val = dfs(i, sum + coins[i],coins,amount);
            if(val != Integer.MAX_VALUE){
                min = Math.min(min,val+1); //+1 signifying adding this coin as part
            }
        } 
        map.put(key,min);   
        return min;
    }
    public int coinChange(int[] coins, int amount) {        
        int ans = dfs(0,0,coins,amount);
        if(ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}