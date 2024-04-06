class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zC=0;
        int ind=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                prod*=nums[i];
            else{
                ind=i;
                zC++;
            }
        }
        if(zC>=2) return new int[nums.length];
        if(zC==1){
            for(int i=0;i<nums.length;i++)
                nums[i]=0;
            nums[ind]=prod;
            return nums;
        }

        for(int i=0;i<nums.length;i++)
            nums[i]=prod/nums[i];

        return nums;
    }
}