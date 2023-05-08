class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length <=0 ) return -1;
        if(mat.length!=mat[0].length) return -1;

        int sum=0;
        int left_i=0;
        int left_j=0;
        int right_i=0;
        int right_j=mat.length-1;
        for(int i=0;i<mat.length;i++){
            if(left_i==right_i && left_j==right_j){
                sum+=mat[left_i][left_j];
                left_i++;
                left_j++;
                right_i++;
                right_j--;
            }
            else{
                sum+=mat[left_i][left_j] + mat[right_i][right_j];
                left_i++;
                left_j++;
                right_i++;
                right_j--;
            }
        }
        return sum;
    }
}