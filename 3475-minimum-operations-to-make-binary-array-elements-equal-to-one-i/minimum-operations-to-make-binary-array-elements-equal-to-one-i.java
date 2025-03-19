class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        int ind = 0;
        while(ind < nums.length){
            while(ind < nums.length && nums[ind] == 1){
                ind++;
            }
            if(ind < nums.length && nums[ind] == 0){
                if(ind + 1 >= nums.length || ind+2 >= nums.length)
                    return -1;
                ans++;
                nums[ind] = 1;
                if(nums[ind+1] == 0){
                    nums[ind+1] = 1;
                }else{
                  nums[ind+1] = 0;  
                }
                if(nums[ind+2] == 0){
                    nums[ind+2] = 1;
                }else{
                    nums[ind+2] = 0; 
                }
            
            }
        }
        return ans;
    }
}