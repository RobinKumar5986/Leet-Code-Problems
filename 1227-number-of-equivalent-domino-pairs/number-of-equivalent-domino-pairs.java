class Solution {
    public int numEquivDominoPairs(int[][] dom) {
        int ans = 0;
        int[] map = new int[100];

        for(int[] ele : dom){
            int min = Math.min(ele[0],ele[1]);
            int max = Math.max(ele[0],ele[1]);
            int ind = (min * 10 ) + max;
            
            ans += map[ind];
            map[ind]++;
        }
        return ans;
    }
}