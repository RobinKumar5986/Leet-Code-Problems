class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] map = new int[101];
        int max = 0;
        for(int ele : nums){
            map[ele]++;
            max = Math.max(max,map[ele]);
        }
        int ans = 0;
        for(int ele : map){
            if(ele == max)
                ans += ele;
        }
        return ans;
    }
}