class Solution {
    public int[] productExceptSelf(int[] nums) {
        boolean zero_flag=false;
        int mul=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                if(zero_flag){
                    Arrays.fill(nums,0);
                    return nums;
                }
                zero_flag=true;
            }
            else mul*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(zero_flag==true && nums[i]!=0) nums[i]=0;
            else if(zero_flag==true && nums[i]==0) nums[i]=mul;
            else nums[i]=mul/nums[i];
        }
        return nums;
    }
}