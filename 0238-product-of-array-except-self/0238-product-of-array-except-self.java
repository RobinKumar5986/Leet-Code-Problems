class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int mul=1;
        int c=0;
        int ind=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                mul*=nums[i];
            else{
                c++;
                ind=i;
            }
        }
        if(c>=2)
            return ans;
        else if(c==1)
            ans[ind]=mul;
        else{
            for(int i=0;i<ans.length;i++)
                ans[i]=mul/nums[i];
        }
        return ans;
    }
}