class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int[][] ans = new int[grid.length][grid[0].length];
        int stRow = 0;
        int stCol = 0;
        int endRow = grid.length-1;
        int endCol = grid[0].length-1;

        List<int[]> layers = new ArrayList<>();
        while(stRow < endRow && stCol < endCol){
            int len = 2*(endRow-stRow)  +  2*(endCol - stCol); 

            int[] layer = new int[len];
            int ind = 0;
            for(int i = stCol; i<= endCol; i++){
                layer[ind++] = grid[stRow][i];
            }
            stRow++;

            for(int i = stRow; i <= endRow;i++){
                layer[ind++] = grid[i][endCol];
            }
            endCol--;

            for(int i = endCol; i >= stCol; i--){
                layer[ind++] = grid[endRow][i];
            }
            endRow--;
            
            for(int i = endRow; i >= stRow; i--){
                layer[ind++] = grid[i][stCol];
            }
            stCol++;
            int r = k % len;
            int[] upLayer = new int[len];
            for(int i = 0 ; i < len ; i++){
                upLayer[i] = layer[(i + r) % len];
            }
            layers.add(upLayer);

            stRow--;
            endCol++;
            endRow++;
            stCol--;

            ind = 0;
            for(int i = stCol; i<= endCol; i++){
                ans[stRow][i] = upLayer[ind++];
            }
            stRow++;

            for(int i = stRow; i <= endRow;i++){
                ans[i][endCol] = upLayer[ind++];
            }
            endCol--;

            for(int i = endCol; i >= stCol; i--){
                ans[endRow][i] = upLayer[ind++];
            }
            endRow--;
            
            for(int i = endRow; i >= stRow; i--){
                ans[i][stCol] = upLayer[ind++];
            }
            stCol++;

        }

        // for(int[] layer : layers){
        //     for(int ele : layer){
        //         System.out.print(ele + " ");
        //     }
        //     System.out.println();
        // }
       
        return ans;
    }
}