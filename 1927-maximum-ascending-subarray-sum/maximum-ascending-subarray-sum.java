class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans = 0;
        int prev = -1;
        int sum = 0;
        for(int ele : nums){
            if(prev >= ele){
                sum = ele;
            }else{
                sum += ele;
            }
            prev = ele;
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}