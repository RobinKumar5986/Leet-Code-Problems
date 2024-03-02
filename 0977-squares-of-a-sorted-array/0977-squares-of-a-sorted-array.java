class Solution {
    public int[] sortedSquares(int[] nums) {
      int[] ans=new int[nums.length];
      int hi=nums.length-1;
      int lo=0;
      int ind=nums.length-1;
      while(lo<=hi){
          if(Math.abs(nums[lo]) > Math.abs(nums[hi])){
              ans[ind--]=nums[lo]*nums[lo];
              lo++;
          }else{
              ans[ind--]=nums[hi]*nums[hi];
              hi--;
          }
      }
      return ans;
    }
}