class Solution {
    public int[] getMaximumXor(int[] nums, int bit) {
        int xor = 0;
        for(int ele : nums){
            xor ^= ele;
        }
        
        int[] ans = new int[nums.length];
        int ind = 0;
        int n = (1 << bit) - 1 ;

        for(int i = nums.length-1; i >= 0 ; i--){
            int k = xor ^ n;
            ans[ind++] = k;
            xor ^= nums[i];
        }
        return ans;
    }
}