class Solution {
    public boolean check(int[] nums) {
        int co = 0;
        for(int i = 1; i <= nums.length; i++){
            int cur = i % nums.length;
            int prev = i-1;
            if(nums[prev] > nums[cur]){
                co++;

            }
            if(co > 1 )
                return false;
        }
        return true;
    }
}