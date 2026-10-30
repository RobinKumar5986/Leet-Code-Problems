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
            if(set.contains(ele-1)) continue;

            for(int i = ele ; i <= max; i++){
                if(set.contains(i)){
                    co++;
                }else{
                    break;
                }

            }
            ans = Math.max(co, ans);
            co = 0;
        }
        return ans;
    }
}