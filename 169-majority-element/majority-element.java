class Solution {
    public int majorityElement(int[] nums) {
        int co = 0;
        int num = 0;

        for(int i = 0 ; i < nums.length; i++){
            if(i==0){
                co++;
                num = nums[i];
            }else{
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
        }
        return num;
    }
}