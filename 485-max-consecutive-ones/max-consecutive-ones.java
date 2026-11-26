class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int co = 0 ;
        int ans = 0;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == 1){
                co++;
            }else{
                ans = Math.max(ans,co);
                co = 0;
            }
        }
        return Math.max(co,ans);
    }
}