class Solution {
    HashMap<String,Integer> map = new HashMap<>();

    int dfs(int[][] grid, int r ,int c , int lRow, int lCol) {
        String s = r + "," + c;
        if(map.containsKey(s))
            return map.get(s);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        
        // case 1
        if (r - 1 >= 0 && c + 1 < lCol && grid[r-1][c+1] > grid[r][c]) {
            n1 = dfs(grid, r-1, c+1, lRow, lCol) + 1;
        }
        
        // case 2
        if (r >= 0 && r < lRow && c + 1 < lCol && grid[r][c+1] > grid[r][c]) {
            n2 = dfs(grid, r, c+1, lRow, lCol) + 1;
        }
        
        // case 3
        if (r + 1 < lRow && c + 1 < lCol && grid[r+1][c+1] > grid[r][c]) {
            n3 = dfs(grid, r+1, c+1, lRow, lCol) + 1;
        }
        
        int max =  Math.max(n1, Math.max(n2, n3));
        map.put(s , max);
        return map.get(s);
    }
    public int maxMoves(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length ; i++){
            int temp = dfs(grid,i,0,grid.length,grid[0].length);
            if(temp > max)
                max = temp;
        }
        return max;
    }
}