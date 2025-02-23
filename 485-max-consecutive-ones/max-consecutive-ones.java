class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int co = 0;
        for(int ele : nums){
            if(ele != 1){
                ans = Math.max(co,ans);
                co = 0;
            }else{
                co++;
            }
        }
        ans = Math.max(co,ans);
        return ans;
    }
}