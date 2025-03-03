class Solution {
    public int[] pivotArray(int[] nums, int pv) {
        int lo =0;
        int min = 0;
        int co = 0;
        for(int ele : nums){
            if(ele == pv)
                co++;
            if(ele < pv)
                min++;
        }
        int hi = min+co;
        int ans[] = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] < pv){
                ans[lo] = nums[i];
                lo++;
            }else if(nums[i] > pv){
                ans[hi] = nums[i];
                hi++;
            }
        }
        while(lo < min+co){
            ans[lo++] = pv;
        }
        return ans;   
    }
}