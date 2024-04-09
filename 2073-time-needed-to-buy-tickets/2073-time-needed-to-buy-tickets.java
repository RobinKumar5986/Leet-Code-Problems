class Solution {
    public int timeRequiredToBuy(int[] tick, int k) {
        int remain=tick[k];
        int ans=0;
        while(true){
            for(int i=0;i<tick.length;i++){
                if(tick[i]>0){
                    tick[i]--;
                    ans++;
                }
                if(i==k)
                    remain--;
                if(remain==0)
                    return ans;
            }
        }
    }
}