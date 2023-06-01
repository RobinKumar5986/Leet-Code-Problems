class Solution {
    public int searchInsert(int[] nums, int target) {
        int possibleInd=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                possibleInd=i;
                break;
            }
            if(nums[i]>target){
                possibleInd=i;
                break;
            }
        }
        if(nums[nums.length-1]<target){
            possibleInd=nums.length;
        }
        return possibleInd;
    }
}