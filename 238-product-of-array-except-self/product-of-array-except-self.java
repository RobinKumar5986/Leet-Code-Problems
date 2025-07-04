class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ze = 0;
        int mul = 1;
        for(int ele : nums){
            if(ele == 0)
                ze++;
            else
                mul = mul * ele;
        }
        if(ze >= 2)
            return new int[nums.length];
        if(ze == 1){
            for(int i  = 0 ; i < nums.length ; i++){
                if(nums[i] != 0){
                    nums[i] = 0;
                }else{
                    nums[i] = mul;
                }
            }
            return nums;
        }else{
            for(int i  = 0 ; i < nums.length ; i++){
                nums[i] = mul / nums[i];
            }
            return nums;
        }
    }
}