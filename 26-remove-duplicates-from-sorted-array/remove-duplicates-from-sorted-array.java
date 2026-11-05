class Solution {
    public int removeDuplicates(int[] nums) {
        int lo = 0;
        int hi = 1;
        while( hi < nums.length) {
            while(hi < nums.length && nums[hi-1] == nums[hi]){
                hi++;
            }
            if(hi >= nums.length)
                break;
            nums[++lo] = nums[hi];
            hi++;
        }
        // System.out.println("LO -> " + lo);
        return lo+1;
    }
}