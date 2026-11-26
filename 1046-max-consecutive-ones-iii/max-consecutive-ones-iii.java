class Solution {
    public int longestOnes(int[] nums, int k) {
        int lo = 0;
        int ans = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if( k == 0 && nums[i] == 0){
                while( k == 0 && k <= i){
                    if(nums[lo] == 0)
                        k++;
                    lo++;
                }
                k--;
            }else{
                if(nums[i] == 0 )
                    k--;
            }
            ans = Math.max(i-lo+1,ans);
        }
        return ans;
    }
}