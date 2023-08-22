class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=0;
        int flag=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max){max=sum;}

            if(sum<0) {sum=0; flag=1;}
        }
        if(flag==1 && max==0){
            int min=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>min){
                    min=nums[i];
                    
                }
            }
            return min;

        }

        return max;

    }
}