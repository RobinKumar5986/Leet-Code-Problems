class Solution {
    int ans = 0;
    void subSet(int[] nums,int ind, int xor){
        if(ind >= nums.length){
            ans += xor;
            return;
        }
        //include
        subSet(nums, ind+1,xor ^ nums[ind]); 

        //not include
        subSet(nums, ind+1, xor); 
    }
    public int subsetXORSum(int[] nums) {
        subSet(nums,0,0);
        return ans;
    }
}