class Solution {
    public int equalPairs(int[][] grid) {
        // List<String> row = new ArrayList<>();
        // HashMap<String,Integer> col = new HashMap<>();
        // int count=0;

        // for(int i=0;i<grid.length;i++){
        //     String r="";
        //     String c="";
        //     for(int j=0;j<grid.length;j++){
        //         r=r+grid[i][j]+",";
        //         c=c+grid[j][i]+",";
        //     }            
        //     row.add(r);
        //     if(!col.containsKey(c)){
        //         col.put(c,1);
        //     }else{
        //         col.put(c,col.get(c)+1);
        //     }
            
        // }
        // for(int i=0;i<row.size();i++){
        //     if(col.containsKey(row.get(i))){
        //         count+=col.get(row.get(i));
        //     }
        // }
        // return  count;

//-----------Optmized code------------//
        Map<String,Integer> map=new HashMap<>();

        for(int[] row : grid){
            map.merge(Arrays.toString(row),1,Integer::sum);
        }
        int count=0;
        for(int c=0,n=grid.length; c<n;++c){
            int[] col=new int[n];
            for (int r = 0; r < n; ++r) {
                col[r] = grid[r][c];
            }
            count += map.getOrDefault(Arrays.toString(col), 0);
        }
        return count;
    }
}