class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[ (int)(nums.length/2) ];
        int ans = 0;
        for(int ele : nums) {
            ans += Math.abs(ele-mid);
        }
        return ans;
    }
}