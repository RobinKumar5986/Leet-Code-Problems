class Solution {
    public int maxProfit(int[] nums) {
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