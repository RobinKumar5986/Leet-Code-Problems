class Solution {
    public int getMaximumGenerated(int n) {
        if(n <= 0)
            return 0;
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        int max = 1;
        for(int i = 0;i <= n ;i++){
            if(2 <= (2*i) && (2*i) <= n){
                nums[2*i] = nums[i]; 
                if(nums[2*i] > max){
                    max = nums[2*i];
                }
            }
            if(2<= (2*i+1) && (2*i+1) <=n ){
                nums[2*i+1] = nums[i] + nums[i+1];
                if( nums[2*i+1] > max){
                    max =  nums[2*i+1];
                }
            }
        }
        return max;
    }
}