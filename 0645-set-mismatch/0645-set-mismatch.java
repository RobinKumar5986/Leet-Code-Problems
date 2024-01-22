class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        int[] freq=new int[nums.length];
        for(int ele:nums)
            freq[ele-1]++; 
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2)
                ans[0]=i+1;
            if(freq[i]==0)
                ans[1]=i+1;
        }
        return ans;
    }
}