class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] tracker = new int[nums.length+1];
        for(int[] ele : queries){
            tracker[ele[0]]++;
            tracker[ele[1]+1]--;
        }
        int cur = 0;
        for(int i = 0 ; i < nums.length ; i++){
            cur += tracker[i];
            nums[i] -= cur;
            if(nums[i] > 0)
                return false;
        }
        return true;
    }
}