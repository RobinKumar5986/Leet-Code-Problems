class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int ele : nums){
            String s = ele + "";
            if(s.length() % 2 == 0)
                ans++;
        }
        return ans;
    }
}