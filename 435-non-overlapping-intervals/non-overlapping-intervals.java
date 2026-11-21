class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        Arrays.sort(nums,(a,b) -> {
            return a[1] - b[1];
            
        });

        int ans = 0;
        int max = nums[0][1];
        for(int i = 1; i < nums.length; i++){
            int[] ele = nums[i];
            if(max > ele[0] ){
                ans++;
            }else{
                max = ele[1];
            }
            
        }

        return ans;
    }
}