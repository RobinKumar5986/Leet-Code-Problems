class Solution {
    public int eraseOverlapIntervals(int[][] grid) {
        Arrays.sort(grid,(a,b) -> {
            if(a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0];
        });
        int min = grid[0][0];
        int max = grid[0][1];
        int ans = 0;
        for(int i = 1; i < grid.length; i++){
            if(grid[i][0] < max){
                // System.out.println(i);
                ans++;
                max = Math.min(max, grid[i][1]);
            }else{
                //no overlap
                min = grid[i][0];
                max = grid[i][1];
            }
        }
        return ans;

    }
}