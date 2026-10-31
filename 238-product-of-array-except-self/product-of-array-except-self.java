class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int co = 0;
        for(int ele : nums) {
           
            if(ele == 0){ 
                co++;
                if(co >= 2) return new int[nums.length];
                continue;
            }
            pro = pro * ele;
        }
        if(co == 1) {
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){ 
                    nums[i] = 0;
                }else{
                    nums[i] = (int)pro;
                }
            }
            return nums;
        }
        for(int i = 0 ; i < nums.length; i++){
            nums[i] = (int)(pro / nums[i]);
        }
        return nums;
    }
}