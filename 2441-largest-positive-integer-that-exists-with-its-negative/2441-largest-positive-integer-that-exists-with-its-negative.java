class Solution {
    public int findMaxK(int[] nums) {
        int max=-1;
        boolean[] pv=new boolean[1001];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                pv[nums[i]]=true;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int t=Math.abs(nums[i]);
                if(pv[t] && max<t)
                    max=t; 
            }
        }
        return max;
    }
}