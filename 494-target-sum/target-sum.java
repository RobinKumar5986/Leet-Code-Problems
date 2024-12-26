class Solution {
    int ans = 0;
    void tree(int[] nums,int sum,int ind,int target){
        if(ind >= nums.length){
            if(sum == target)
                ans++;
            return;
        }
        //case +
        tree(nums,sum + nums[ind],ind+1,target);

        //case -
        tree(nums,sum - nums[ind],ind+1,target);
    }
    public int findTargetSumWays(int[] nums, int target) {
        tree(nums,0,0,target);
        return ans;
    }
}