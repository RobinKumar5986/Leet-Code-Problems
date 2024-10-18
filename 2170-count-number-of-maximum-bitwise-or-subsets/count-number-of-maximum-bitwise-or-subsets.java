class Solution {
    int max = 0;
    int c = 0;
    void subset(int[] nums , int cur , int ind){
        if(ind == nums.length){
            if(cur == max)
                c++;
            return;
        }
        //not include
        subset(nums , cur , ind+1);
        //include
        subset(nums , cur | nums[ind], ind+1);
    }
    public int countMaxOrSubsets(int[] nums) {
        for(int ele : nums)
            max = max | ele;
        subset(nums,0,0);
        return c;
    }
}