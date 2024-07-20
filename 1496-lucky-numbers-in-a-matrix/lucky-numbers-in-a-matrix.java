class Solution {
    public List<Integer> luckyNumbers (int[][] mat) {
        int[] min=new int[mat.length];
        int[] max=new int[mat[0].length];

        for(int r=0;r<mat.length;r++){
            for(int c = 0;c < mat[0].length;c++){
                if(min[r] == 0)
                    min[r] = mat[r][c];
                
                if(min[r] > mat[r][c])
                    min[r] = mat[r][c];
                if(max[c] < mat[r][c])
                    max[c] = mat[r][c];
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int row=0;row < mat.length ; row++){
            for(int col=0; col < mat[0].length ; col++){
                if(min[row] == max[col])
                    ans.add(min[row]);
            }
        }
        return ans;
    }
}