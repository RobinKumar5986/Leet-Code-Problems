class Solution {
    public int[] pivotArray(int[] nums, int pv) {
        int[] ans = new int[nums.length];
        int lo = 0;
        int hi = nums.length-1;
        for(int i = 0 , j = nums.length -1 ; i < nums.length; i++,j--){
            int bInd = nums.length- 1 - i;
            if(nums[i] < pv)
                ans[lo++] = nums[i];
            if(nums[j] > pv)
                ans[hi--] = nums[j];
        }
        while(lo <= hi){
            ans[lo++] = pv;
        }
        return ans;
    }
}