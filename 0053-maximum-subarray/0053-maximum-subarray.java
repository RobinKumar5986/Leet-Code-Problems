class Solution {
    public int maxSubArray(int[] nums) {
        //----------------Brute Force----------------//


        // int sum=0;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<=nums.length;j++){
        //         sum=0;
        //         for(int k=i;k<j;k++){
        //             sum=sum+nums[k];
        //         }
        //         if(sum>max){
        //             max=sum;
        //         }
        //     }
        // }

        //--------kadane's Algorithm---------//
        //--------Also works for all -ve Value--//
        int max=Integer.MIN_VALUE;
        int sum=0;
        int neg=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                // if(sum>neg){
                //     neg=sum;
                // }
                sum=0;
            }
        }
        if(neg>max){
            return neg;
        }
        return max;
    }
}