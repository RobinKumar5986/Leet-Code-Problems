class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4) return 0;
        Arrays.sort(nums);

        int n1=nums[nums.length-4]-nums[0];
        int n2=nums[nums.length-3]-nums[1];
        int n3=nums[nums.length-2]-nums[2];
        int n4=nums[nums.length-1]-nums[3];
        if(n3<n1 && n3<n2 && n3<n4)
            return n3;
        if(n2<n1 && n2<n3 && n2<n4)
            return n2;
        if(n1<n2 && n1<n3 && n1<n4)
            return n1;
        return n4;
    }
}