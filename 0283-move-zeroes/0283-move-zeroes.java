class Solution {
    public void moveZeroes(int[] nums) {
        // Arrays.sort(nums);
       int zc=0;
       boolean flag=false;
       int zind=0;
       for(int i=0;i<nums.length;i++){
           if(zc==0 && nums[i]==0){
               zc++;
               zind=i;
           }
           if(zc!=0 && nums[i]==0){
               flag=true;

           }

           if(nums[i]!=0 && flag){
               nums[zind]=nums[i];
               nums[i]=0;


               if(flag){
                   zind++;
               }
               else{
                   zind=i;
               }
           }
       }
    }
}