class Solution {
    public int[] productExceptSelf(int[] nums) {
        boolean zero_flag=false;
        int mul=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                zero_flag=true;
                count++;
                if(count>1){
                    return new int[nums.length];
                }
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