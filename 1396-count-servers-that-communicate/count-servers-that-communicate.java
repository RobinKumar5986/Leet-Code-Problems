class Solution {
    Set<String> seen = new HashSet<>();
    boolean expandRow(int row,int col,int[][] grid){
        boolean isFound = false;
        for(int i = row+1; i < grid.length; i++){
            if(grid[i][col] == 1){
                isFound = true;
                seen.add(i + "," + col);
            }
        }
        return isFound;
    }
    boolean expandCol(int row,int col,int[][] grid){
        boolean isFound = false;
        for(int i = col+1; i < grid[0].length; i++){
            if(grid[row][i] == 1){
                isFound = true;
                seen.add(row + "," + i);
            }
        }
        return isFound;
    }
    public int countServers(int[][] grid) {

        for(int row = 0 ; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 0)
                    continue;
                int sz = seen.size();
                boolean op1 = expandRow(row,col,grid);
                boolean op2 = expandCol(row,col,grid);
                if(op1 || op2){
                    seen.add(row + "," + col);
                }
            }
        }

        return seen.size();
    }
}