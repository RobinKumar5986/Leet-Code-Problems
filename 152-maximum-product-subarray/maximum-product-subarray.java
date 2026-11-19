class Solution {
    public int maxProduct(int[] nums) {
        int pfx = 1;
        int sfx = 1;
        int ans = Integer.MIN_VALUE;

        for(int i = 0,j = nums.length-1; i < nums.length; i++, j--){
            if(nums[i] != 0){
                pfx = pfx * nums[i];
                ans = Math.max(ans,pfx);
            }else{
                ans = Math.max(ans,0);
                pfx = 1;
            }
            if(nums[j] != 0){
                sfx = sfx * nums[j];
                ans = Math.max(ans,sfx);
            }else{
                ans = Math.max(ans,0);
                sfx = 1;
            }
        }
        return ans;
    }
}