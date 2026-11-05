class Solution {
    public void moveZeroes(int[] nums) {
        int ze = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0 ){
                if(ze == -1){
                    ze = i; //intital push
                }
            }else{
                if(ze != -1){
                    nums[ze++] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }
}