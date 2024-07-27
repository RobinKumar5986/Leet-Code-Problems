class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long[][] dest = new long[26][26];
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                dest[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int ind=0;ind<original.length;ind++){
            int i = original[ind] - 'a';
            int j = changed[ind] - 'a';
            dest[i][j] = Math.min(dest[i][j],cost[ind]);
        }
        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    dest[i][j]=Math.min(dest[i][j], dest[i][k] + dest[k][j]);
                }
            }
        }
        long ans = 0;
        for(int ind = 0 ; ind<source.length() ; ind++){
            int i=source.charAt(ind) - 'a';
            int j=target.charAt(ind) - 'a';
            if(i == j)
                continue;
            long dis=dest[i][j];
            if(dis==Integer.MAX_VALUE)
                return -1L;
            ans+=dis;
        }
        return ans;
    }
}