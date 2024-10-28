class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = -1;
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        for(int i = 0 ; i < nums.length ; i++){
            int sq = (int)Math.sqrt(nums[i]);
            if( sq * sq != nums[i])
                continue;
            int c = 1;
            while(true){
                if(set.contains(sq)){
                    int temp = sq;
                    sq = (int)Math.sqrt(sq);
                    c++;
                    if(sq*sq != temp)
                        break;
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