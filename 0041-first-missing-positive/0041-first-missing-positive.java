class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==1){
            if(nums[0]<=0) return 1;
            else if(nums[0]>1) return 1;
            else return nums[0]+1;
        }
        int min=Integer.MAX_VALUE;
        int minP=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int ele : nums){
            if(min>ele)
                min=ele;
            if(ele > 0 && ele < minP)
                minP=ele;
            if(ele > max)
                max=ele;
        }
        
        if(minP>1) return 1;

        boolean[] present=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && ( (nums[i] - minP) < nums.length))
                present[nums[i] - minP]=true;
        }

        for(int i=0;i<nums.length;i++){
            if(!present[i])
                return minP+i;
        }
        return 1+nums.length;
    }
}