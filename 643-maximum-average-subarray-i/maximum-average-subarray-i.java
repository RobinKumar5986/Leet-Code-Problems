class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //intial sum
        double sum = 0;
        double avg = 0;
        for(int i = 0 ; i < k; i++){
            sum += nums[i];
        }
        avg = sum/k;

        int lo = 1;
        int hi = k;
        
        while(hi < nums.length){
            sum -= nums[lo-1];
            sum += nums[hi];

            double temp = sum/k;
            if(temp > avg) avg = temp;

            hi++;
            lo++;
        }

        return avg;
    }
}