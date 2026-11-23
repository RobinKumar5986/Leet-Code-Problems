class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int len = mat.length * mat[0].length;

        int lo = 0;
        int hi = 0;
        int loMax = mat.length;
        int hiMax = mat[0].length;
        while(ans.size() < len){

            for(int i = hi; i < hiMax; i++)
                ans.add(mat[lo][i]);
            lo++;

            for(int i = lo; i < loMax; i++)
                ans.add(mat[i][hiMax-1]);
            hiMax--;

            for(int i = hiMax-1; i >= hi; i--)
                ans.add(mat[loMax-1][i]);
            loMax--;

            for(int i = loMax-1; i >= lo; i--)
                ans.add(mat[i][hi]);
            hi++;
        }
        while(ans.size() > len){
            ans.remove(ans.size()-1);
        }
        return ans;
    }
}