class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (a,b) -> {
            if(a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0];
        });
        int min = nums[0][0];
        int max = nums[0][1];

        List<int[]> lst = new ArrayList<>();
        for(int i = 1; i < nums.length; i++){
            if(nums[i][0] > max ){
                int[] pair = new int[2];
                pair[0] = min;
                pair[1] = max;
                lst.add(pair);

                min = nums[i][0];
            }
            max = Math.max(max,nums[i][1]);
        }
        int[] pair = new int[2];
        pair[0] = min;
        pair[1] = max;
        lst.add(pair);
        
        int[][] ans = new int[lst.size()][2];
        int ind = 0;
        for(int[] ele : lst) {
            ans[ind][0] = ele[0];
            ans[ind++][1] = ele[1];
        }
        return ans;

    }
}