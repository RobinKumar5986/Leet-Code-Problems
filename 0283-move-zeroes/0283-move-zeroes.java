class Solution {
    public void moveZeroes(int[] nums) {
    //    int zc=0;
    //    int zind=0;
    //    for(int i=0;i<nums.length;i++){
    //        if(zc==0 && nums[i]==0){
    //            zc++;
    //            zind=i;
    //        }
    //        if(zc!=0 && nums[i]==0){
    //            zc++;
    //        }
    //        if(nums[i]!=0 && zc >=1){
    //            nums[zind]=nums[i];
    //            nums[i]=0;
    //            if(zc>1){
    //                zind++;
    //            }
    //            else{
    //                zind=i;
    //            }
    //        }
    //    }
    // }class Solution {

//-------Opmized Solution-------------//

        int snowBallSize = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                snowBallSize++; 
            }
            else if (snowBallSize > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-snowBallSize]=t;
            }
        }
    }
}