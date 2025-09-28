class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length < 3) return 0;
        int ans = 0;
        Arrays.sort(nums);
        int i = nums.length - 1;
        int j = nums.length - 2;
        int k = nums.length - 3;
        while( k >= 0){
            int s1 = nums[i];
            int s2 = nums[j];
            int s3 = nums[k];

            //checking can we form a triangle
            if(s2 + s3 > s1){
                int para = s1 + s2 + s3;
                ans = Math.max(ans,para);
            }
            i--;
            j--;
            k--;
        }
        return ans;
    }
}