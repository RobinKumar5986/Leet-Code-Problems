class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        Arrays.sort(nums,(a,b) -> {
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        int ans = 0;
        int max = nums[0][1];
        for(int i = 1; i < nums.length; i++){
            int[] ele = nums[i];
            if(max > ele[0] ){
                ans++;
                max = Math.min(max,ele[1]);
            }else{
                max = ele[1];
            }
            
        }

        return ans;
    }
}