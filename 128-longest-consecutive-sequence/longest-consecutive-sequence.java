class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for(int ele : nums) {
            set.add(ele);
            if(ele > max) max = ele;
        }
        int co = 0;
        int ans = 0;
        for(int ele : set) {
            if(set.contains(ele-1)){
                continue;
            }
            int len = 1;
            while(set.contains(ele + len)){ len++; }
            ans = Math.max(len,ans);
        }
        return ans;
    }
}