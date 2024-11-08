class Solution {
    public int[] getMaximumXor(int[] nums, int bit) {
        int xor = 0;
        for(int ele : nums){
            xor ^= ele;
        }
        
        int[] ans = new int[nums.length];
        int ind = 0;
        for(int i = nums.length-1; i >= 0 ; i--){
            int n = (int)Math.pow(2,bit) - 1;
            int k = xor ^ n;
            ans[ind++] = k;
            xor ^= nums[i];
        }
        return ans;
    }
}