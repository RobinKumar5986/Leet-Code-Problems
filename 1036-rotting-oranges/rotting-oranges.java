class Solution {
    public int orangesRotting(int[][] grid) {
        Set<String>  set = new HashSet<>(); //for already visited
        int good = 0;
        int rottent = 0;
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    good++;
                }
                if(grid[i][j] == 2)
                    rottent++;
            }
        }
        if(rottent == 0 && good != 0)
            return -1;
        if(good == 0)
            return 0;
        int ans = 0;
        int rem = good;
        for(int i = 0 ; i < good ; i++){
            Set<String> update = new HashSet<>();
            for(int row = 0 ; row < grid.length; row++){
                for(int col = 0 ; col < grid[0].length; col++){
                    if(set.contains( row + ":" +  col) )
                        continue;
                    if(grid[row][col] == 2){
                        set.add(row + ":" + col);
                        //up
                        if(row -1 >= 0 && grid[row-1][col] == 1){
                            update.add((row - 1) + ":" +  col);
                        }
                        //down
                        if(row + 1 < grid.length && grid[row+1][col] == 1){
                            update.add((row + 1) + ":" + col);
                        }
                        //left
                        if(col -1 >= 0 && grid[row][col-1] == 1){
                            update.add(row + ":" + (col-1));
                        }
                         //right
                        if(col + 1 < grid[0].length && grid[row][col+1] == 1){
                            update.add(row + ":"+ (col+1));
                        }
                    }
                }
            }
            if(update.isEmpty() && rem > 0)
                return -1;
            for(String ele : update ){
                String[] parts = ele.split(":"); 
                int r = Integer.parseInt(parts[0]);
                int c = Integer.parseInt(parts[1]);
                grid[r][c] = 2;
            }
            ans++;
            rem -= update.size();
            if(rem <= 0)
                break;            
        }
        return ans;
    }
}