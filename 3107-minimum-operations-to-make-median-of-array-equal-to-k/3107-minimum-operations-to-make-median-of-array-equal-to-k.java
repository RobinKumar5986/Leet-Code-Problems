import java.util.Arrays;

class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int median;
        int medianPos;

        if (n % 2 == 1) {
            medianPos = n / 2;
            median = nums[medianPos];
        } else {
            medianPos = n / 2;
            median = (nums[medianPos - 1] + nums[medianPos]) / 2;
        }
        long op=0;
        if(nums[medianPos] == k) return 0;
        
        if(nums[medianPos] < k){
            op+=k-nums[medianPos];
            nums[medianPos] = k;
        }
        
        else{
            op+=nums[medianPos]-k;
            nums[medianPos]=k;
        }
        
        
        for(int i=0;i<medianPos;i++){
            if(nums[i]>k){
                op+=nums[i]-k;
                nums[i]=k;
            }
        }
        
        for(int i=medianPos+1;i<nums.length;i++){
           if(nums[i]<k){
               op+=k-nums[i];
               nums[i]=k;
           }
        }
        return op;
    }
}
