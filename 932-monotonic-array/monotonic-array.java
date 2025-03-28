class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length < 2)
            return true;
       
        Integer n1 = nums[0];
        Integer n2 = null;
        for(int ele : nums){
            if(ele != n1){
                n2 = ele;
                break;
            }
        }
        if(n2 == null)
            return true;
        if(n1 < n2){
            for(int i = 1 ; i< nums.length ; i++){
                if(nums[i-1] > nums[i])
                    return false;
            }
        }else{
            for(int i = 1 ; i< nums.length ; i++){
                if(nums[i-1] < nums[i])
                    return false;
            }
        }
        return true;
    }
}