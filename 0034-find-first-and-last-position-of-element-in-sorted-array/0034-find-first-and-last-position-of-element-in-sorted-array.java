class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length<=0) return  new int[]{-1,-1};    //edge case
        if(nums.length==1 && nums[0]==target) return new int[]{0,0};    //edge case
        else if(nums.length==1 && nums[0]!=target) return  new int[]{-1,-1};  //edge case

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(i+1<nums.length){

                    if(nums[nums.length-1]==target)  return new int[]{i,nums.length-1}; //edge case 

                    for(int j=i+1;j<nums.length;j++){
                        if(nums[j]!=target){
                             return new int[]{i,j-1};
                        }
                    }
                }
                return new int[]{i,i};
            }
        }

        return new int[]{-1,-1};
    }
}