class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = 0;
        if(cost1 + cost2 > costBoth){
            long min = Math.min(need1 , need2);
            need1 -= min;
            need2 -= min;
            ans += min * costBoth;

            if(need1 > 0){
                if(cost1 < costBoth){
                    ans += ((long)cost1) * need1;
                }else{
                    ans += ((long)costBoth) * need1;
                }
            }
            if(need2 > 0) {
                if(cost2 < costBoth){
                    ans += ((long)cost2) * need2;
                }else{
                    ans += ((long)costBoth) * need2;
                }
            } 
        }else{
            ans += ((long)cost1) * need1;
            ans += ((long)cost2) * need2;
        }
        return ans;
    }
}