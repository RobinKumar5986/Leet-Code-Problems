class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int pv=0,nv=1;
        for(int ele:nums){
            if(ele>0){
                ans[pv]=ele;
                pv+=2;
            }else{
                ans[nv]=ele;
                nv+=2;
            }
        }
        return ans;
    }
}