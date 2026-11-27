class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1)return 0;
    
        int max = nums[0];
        int win = nums[0];
        int ans = 1;
        if(max >= nums.length-1)
            return ans;
        
        for(int i = 0 ; i <= max; i++){
            max = Math.max(i + nums[i],max);
            if(i == win){
                win = max;
                ans++;
                if(max >= nums.length-1) // no early exit
                    return ans;
            }
        }
        return -1;
    }
}