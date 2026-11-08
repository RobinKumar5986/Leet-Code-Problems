class Solution {
    public int majorityElement(int[] nums) {
        int co = 1;
        int num = nums[0];

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == num){
                co++;
            }else{
                co--;
            }
            if(co == 0){
                num = nums[i];
                co++;
            }
            
        }
        return num;
    }
}