class Solution {
    public boolean canSortArray(int[] nums) {
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = 0;j<nums.length-1;j++){
                if(nums[j] > nums[j+1]){
                    int set1 = 0;
                    int set2 = 0;
                    int t1 = nums[j];
                    int t2 = nums[j+1];
                    while(t1 != 0){
                        set1 += t1 & 1;
                        t1 >>= 1;
                    }
                    while(t2 != 0){
                        set2 += t2 & 1;
                        t2 >>= 1;
                    }
                    if(set1 != set2)
                        return false;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }   
        return true;
    }
}