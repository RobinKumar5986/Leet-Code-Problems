class Solution {
    public void moveZeroes(int[] nums) {
        int ze = Integer.MAX_VALUE;
        int zeCo = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                ze = Math.min(ze,i);
                // System.out.println("ZE: -> " + ze);
            }else{
                if(ze != Integer.MAX_VALUE){
                    // System.out.println("FLIP: -> " + nums[ze] + " : " +  nums[i]);
                    nums[ze++] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }
}