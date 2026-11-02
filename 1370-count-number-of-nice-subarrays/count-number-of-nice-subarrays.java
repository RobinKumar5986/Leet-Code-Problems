class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans = 0;
        int co = 0;
        int lo = 0;
        int lead = 0;
        for(int i = 0 ; i < nums.length; i++){
            
            if(nums[i] % 2 == 1){
                co++;
                lead = 0; // reset he lead 
            }
            while( k == co){
                lead++;
                if(nums[lo]%2 == 1)
                    co--;
                lo++;
            }
            ans += lead;
        }

        return ans;
        
    }
}