class Solution {
    public int trap(int[] nums) {
        int[] maxL = new int[nums.length];
        int[] maxR = new int[nums.length];
        int m1 = nums[0];
        int m2 = nums[nums.length-1];
        int len = nums.length-1;

        for(int i = 0; i < nums.length; i++){
            m1 = Math.max(m1,nums[i]);
            m2 = Math.max(m2,nums[len-i]);

            maxL[i] = m1;
            maxR[len-i] = m2;

            System.out.println(maxL[i] + " : " + maxR[len-i]);
        }
        int ans = 0;

        for(int i = 1; i < nums.length-1; i++){
            int min = Math.min(maxL[i],maxR[i]);
            int diff = min - nums[i];
            ans += diff;
        }
        return ans;
        
    }
}