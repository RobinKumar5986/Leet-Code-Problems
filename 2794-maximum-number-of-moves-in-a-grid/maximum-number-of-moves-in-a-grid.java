class Solution {
    int[][] dp;
    int[][] directions = {{-1, 1}, {0, 1}, {1, 1}}; // Possible moves: top-right, right, bottom-right

    int dfs(int[][] grid, int r, int c, int lRow, int lCol) {
        if (dp[r][c] != -1) {
            return dp[r][c]; // Return precomputed result
        }

        int maxMoves = 0;
        for (int[] dir : directions) {
            int newRow = r + dir[0];
            int newCol = c + dir[1];

            if (newRow >= 0 && newRow < lRow && newCol < lCol && grid[newRow][newCol] > grid[r][c]) {
                maxMoves = Math.max(maxMoves, dfs(grid, newRow, newCol, lRow, lCol) + 1);
            }
        }

        dp[r][c] = maxMoves;
        return maxMoves;
    }

    public int maxMoves(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        dp = new int[rows][cols];

        // Initialize dp array to -1 for memoization
        for (int i = 0; i < rows; i++) {
            Arrays.fill(dp[i], -1);
        }

        int max = 0;
        for (int i = 0; i < rows; i++) {
            max = Math.max(max, dfs(grid, i, 0, rows, cols));
        }
        return max;
    }
}
