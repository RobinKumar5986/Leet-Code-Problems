class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for(int ele : nums) {
            set.add(ele);
            if(ele > max) max = ele;
        }
        Set<Integer> vis = new HashSet<>();
        int co = 0;
        int ans = 0;
        for(int ele : set) {
            if(vis.contains(ele)) continue;

            for(int i = ele ; i <= max; i++){
                if(set.contains(i)){
                    co++;
                    vis.add(i);
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