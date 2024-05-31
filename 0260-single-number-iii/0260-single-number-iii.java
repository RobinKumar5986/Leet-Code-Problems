class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
            xor^=nums[i];
        
        int diff=1;
        while((diff & xor)==0)
            diff=diff<<1;
        int n1=0;
        int n2=0;
        for(int i=0;i<nums.length;i++){
            if((diff & nums[i])==0)
                n1^=nums[i];
            else
                n2^=nums[i];
        }
        ans[0]=n1;
        ans[1]=n2;
        return ans;
    }
}