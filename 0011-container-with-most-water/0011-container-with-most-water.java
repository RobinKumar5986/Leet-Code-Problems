class Solution {
    public int maxArea(int[] nums) {
        int ans=0;
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
            int h=Math.min(nums[lo],nums[hi]);
            int temp=h*Math.abs(lo-hi);
            if(temp>ans)
                ans=temp;     
            while(lo<hi && nums[lo]<=h)lo++;
            while(lo<hi && nums[hi]<=h)hi--;
        }
        return ans;
    }
}