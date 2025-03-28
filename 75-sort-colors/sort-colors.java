class Solution {
    public void sortColors(int[] nums) {
        //first possible sol
        int co0 = 0;
        int co1 = 0;
        for(int ele : nums){
            if(ele == 0)
                co0++;
            if(ele == 1)
                co1++;
        }
        int ind = 0;
        while(ind < co0){
            nums[ind++] = 0;
        }
        while(co1 > 0){
            nums[ind++] = 1;
            co1--;
        }
        while(ind < nums.length){
            nums[ind++] = 2;
        }
    }
}