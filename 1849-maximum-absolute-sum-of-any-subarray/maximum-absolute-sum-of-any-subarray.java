class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ans = 0;
        //MAX Sum
        int sum= 0;
        int max = 0;
        for(int ele : nums){
            sum += ele;
            if(sum < 0){
                sum = 0;
            }else{
                if(max < sum)
                    max = sum;
            }
        }
        sum = 0;
        //MIN Sum
        int min = 0;
        for(int ele : nums){
            sum += ele;
            if(sum > 0){
                sum = 0;
            }else{
                if(min > sum)
                    min = sum;
            }
        }
        min = min * -1;
        return Math.max(max,min) ;   
    }
}