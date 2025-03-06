class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] map = new int[grid.length*grid[0].length+1];
        for(int i = 0; i<grid.length; i++){
            for(int j = 0 ; j<grid[0].length;j++){
                map[grid[i][j]]++;
            }
        }
        int a = 0;
        int b = 0;
        for(int i=1; i<map.length;i++){
            if(map[i] == 0){
                a = i;
            }
            if(map[i] == 2){
                b = i;
            }
        }
        return new int[]{b,a};
    }
}