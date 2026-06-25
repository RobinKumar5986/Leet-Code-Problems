class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            int co = 0;
            for(int j = i; j<nums.length; j++){
                if(nums[j] == target){
                    co++;
                }
                int len = j-i+1;
                if(co > len/2){
                    ans++;
                }
            }
        }
        return ans;
    }
}