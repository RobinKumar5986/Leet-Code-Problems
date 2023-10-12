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
        if(nums.length==1) return 0;
        int min=nums[0];
        int max_profit=Integer.MIN_VALUE;
        int flag=1;
        for(int i=1;i<nums.length;i++){
                if(nums[i]<min){ 
                        min=nums[i];
                }else{
                        flag=0;
                        int temp=nums[i]-min;
                        if(temp>max_profit) max_profit=temp;
                }
                
        }
        if(flag==1) return 0;
        return max_profit;
    }
}