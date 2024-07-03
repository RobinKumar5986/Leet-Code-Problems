class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4) return 0;
        Arrays.sort(nums);

        int n1=nums[nums.length-4]-nums[0];
        int n2=nums[nums.length-3]-nums[1];
        int n3=nums[nums.length-2]-nums[2];
        int n4=nums[nums.length-1]-nums[3];
        
        return Math.min(n1,Math.min(n2,Math.min(n3,n4)));
    }
}