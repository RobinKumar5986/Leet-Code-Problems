class Solution {
    Map<String,Long> map = new HashMap<>();
    long dfs(int[] coin,int rem,int ind){
        String key = rem + ":" + ind;
        if(rem == 0)
            return 0;
        if(rem < 0)
            return Long.MAX_VALUE;
        if(map.containsKey(key))
            return map.get(key);
        long minStep = Long.MAX_VALUE;
        for(int i = ind; i < coin.length;i++){
            long st = dfs(coin,rem-coin[i],i);
            if(st != Long.MAX_VALUE)
                minStep = Math.min(minStep,st+1);
        }
        map.put(key,minStep);
        return minStep;
    }

    public int coinChange(int[] coins, int amount) {
        long ans = dfs(coins,amount,0);
        if(ans == Long.MAX_VALUE){
            return -1;
        }
        return (int)ans;
    }
}