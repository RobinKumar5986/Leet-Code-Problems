class Solution {
    boolean M1Check(int[][] grid ,int x){
        int mod = grid[0][0] % x;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j]%x != mod)
                    return true;
            }
        }
        return false;
    }
    public int minOperations(int[][] grid, int x) {
        if(grid.length == 1 && grid[0].length == 1)
            return 0;
        if(M1Check(grid,x))
            return -1;
        int[] arr = new int[grid.length*grid[0].length];
        int total = 0;
        int ind = 0;
        for(int i = 0; i < grid.length ;i++){
            for(int j = 0; j< grid[0].length; j++){
                total += grid[i][j];
                arr[ind++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int sum = 0;
        int len = 1;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++,len++){
            int left = (arr[i] * len - sum)/x;
            int right = (int) Math.ceil((total - sum - arr[i] - arr[i] * (arr.length - i)) / (double) x);
            if(left + right < ans)
                ans = left+right;
            sum += arr[i];
        }
        return ans;
    }
}