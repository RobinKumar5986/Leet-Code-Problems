class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i < nums.length) {
            int ind = nums[i];
            ind = ind -1;
            if(ind >= 0 && ind < nums.length && nums[i] != nums[ind]) {
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        for(i = 0 ; i < nums.length; i++){
            if(nums[i] != i+1)
                return i+1;
        }
        return nums.length+1;
    }
}