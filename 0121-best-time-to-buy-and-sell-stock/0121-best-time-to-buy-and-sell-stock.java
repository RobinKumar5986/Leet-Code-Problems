class Solution {
    public int maxProfit(int[] nums) {
//------------------Brute Foce--------------------//
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length-1;i++){

        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]<nums[j] && max<(nums[j]-nums[i])){
        //             max=nums[j]-nums[i];
        //         }
        //     }
        // }
        // if(max==Integer.MIN_VALUE){
        //     return 0;
        // }
        // return max;

//----------------Otmized Solution in O(n) time (using space)--------------//
        // int aux[]=new int[nums.length];
        // int n=nums.length-1;
        // aux[n]=nums[n];
        // for(int i=n-1;i>=0;i--){
        //     if(nums[i]>aux[i+1]){
        //         aux[i]=nums[i];
        //     }else{
        //         aux[i]=aux[i+1];
        //     }
        // }
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     int temp=aux[i]-nums[i];
        //     if(temp>max) max=temp;
        // }
        // return max;
//------------further optmizattion solution in O(n) with constant space--------//
        int maxProfit=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];;
            }
            if(nums[i]-min>maxProfit){
                maxProfit=nums[i]-min;
            }
        }
        return maxProfit;
    }
}