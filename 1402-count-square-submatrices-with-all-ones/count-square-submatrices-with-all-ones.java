class Solution {
    HashMap<String,Integer> map = new HashMap<>();
    int dfs(int r , int c , int[][] mat){
        if(r >= mat.length || c >= mat[0].length || mat[r][c] == 0){
            return 0;
        }
        String s = r+","+c;
        if(map.containsKey(s))
            return map.get(s);

        int len = 1;
        int s1 = dfs(r+1,c,mat);
        int s2 = dfs(r,c+1,mat);
        int s3 = dfs(r+1,c+1 , mat);

        len += Math.min(s1,Math.min(s2,s3));
        map.put(s,len);

        return len; 
    }
    public int countSquares(int[][] mat) {
        int ans = 0;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j< mat[0].length; j++){
                ans += dfs(i,j,mat);
            }
        }
        return ans;
    }
}