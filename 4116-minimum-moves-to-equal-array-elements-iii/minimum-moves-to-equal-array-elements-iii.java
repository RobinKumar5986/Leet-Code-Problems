class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                int diff = nums[i] - max;
                diff = diff * i;
                ans += diff;
                max = nums[i];
            }else{
                ans += max - nums[i];
            }
            System.out.println(ans);
        }
        return ans;
    }
}