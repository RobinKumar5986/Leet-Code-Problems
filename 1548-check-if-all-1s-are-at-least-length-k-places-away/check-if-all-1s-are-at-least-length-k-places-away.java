class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int ind = -1;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == 1 && ind == -1){
                ind = i;
            }else if(nums[i] == 1){
                int gap = i - ind - 1;
                if(gap < k)
                    return false;
                ind = i;
            }
        }
        return true;
    }
}