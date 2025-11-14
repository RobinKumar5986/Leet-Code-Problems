class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans = new int[n][n];

        for(int[] qr : queries){
            int r1 = qr[0];
            int c1 = qr[1];
            int r2 = qr[2];
            int c2 = qr[3];

            for(int i = r1 ; i <= r2; i++){
                for(int j = c1; j <= c2; j++){
                    ans[i][j]++;
                }
            }
        }
        return ans;

    }
}