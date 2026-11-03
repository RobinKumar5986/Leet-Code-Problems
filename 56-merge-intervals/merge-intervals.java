class Solution {
    public int[][] merge(int[][] grid) {
        Arrays.sort(grid,(a,b) -> {
            if(a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0]; 
        });
        // for (int[] row : grid) {
        //     System.out.println(Arrays.toString(row));
        // }
        List<List<Integer>> lst  = new ArrayList<>();
        int min = grid[0][0];
        int max = grid[0][1];

        for(int i = 0 ; i < grid.length; i++){
            int[] row = grid[i];
            if(row[0] > max){
                List<Integer> pair = new ArrayList<>();
                pair.add(min);
                pair.add(max);

                lst.add(pair);
                min = row[0];
                max = row[1];
            }

            max = Math.max(max,row[1]);
        }
        List<Integer> pair = new ArrayList<>();
        pair.add(min);
        pair.add(max);
        lst.add(pair);

        int[][] ans = new int[lst.size()][2];
        for(int i = 0 ; i < lst.size(); i++){
            ans[i][0] = lst.get(i).get(0);
            ans[i][1] = lst.get(i).get(1);
        }
        return ans;
    }
}