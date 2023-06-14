class Solution {
    public void moveZeroes(int[] nums) {
        // Arrays.sort(nums);
       int zc=0;
       int zind=0;
       for(int i=0;i<nums.length;i++){
           if(zc==0 && nums[i]==0){
               zc++;
               zind=i;
           }
           if(zc!=0 && nums[i]==0){
               zc++;
           }

           if(nums[i]!=0 && zc >=1){
               nums[zind]=nums[i];
               nums[i]=0;


               if(zc>1){
                   zind++;
               }
               else{
                   zind=i;
               }
           }
       }
    }
}