class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int co = 0;
        int ans = 0;
        for(int ele : nums){
            if(ele == 0) {
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