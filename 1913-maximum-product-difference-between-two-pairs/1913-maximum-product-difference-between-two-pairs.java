class Solution {
    
    public int maxProductDifference(int[] nums) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int max1=0;
        int max2=0;
        for(int n : nums){
            if(n < min1){
                min2=min1;
                min1=n;
            }else if( n < min2){
                min2=n;
            }

            if(n > max1){
                max2=max1;
                max1=n;
            }else if(n > max2){
                max2=n;
            }
        }
        return (max1*max2)-(min1*min2);
    }
}