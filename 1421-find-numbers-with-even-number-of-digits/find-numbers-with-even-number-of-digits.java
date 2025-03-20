class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int ele : nums){
            int c = 0;
            while(ele > 0){
                ele = ele/10;
                c++;
            }
            if(c%2 == 0)
                ans++;
        }
        return ans;
    }
}