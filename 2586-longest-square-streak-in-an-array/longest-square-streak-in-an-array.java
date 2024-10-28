class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> set = new HashSet<>();
        HashMap<Long,Long> map = new HashMap<>();
        int ans = -1;
        for(int i = 0 ; i < nums.length ; i++){
            set.add((long)nums[i]);
        }
        for(int i = 0 ; i < nums.length ; i++){
            long sq = (long)nums[i] * (long)nums[i];
            int c = 1;
            while(true){
                if(set.contains(sq)){
                    sq = sq * sq;
                    c++;
                }else{
                   break;
                }
            }
            if(c > ans)
                ans = c;
        }
        if(ans <= 1)
            return -1;
        return ans;
    }
}