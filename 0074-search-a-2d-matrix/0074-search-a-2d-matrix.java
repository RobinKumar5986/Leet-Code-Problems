class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //finding the row
        int col=matrix[0].length-1;
        int row=0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col] == target) return true;

            if(matrix[i][col] > target){
                // System.out.println(matrix[i][col]);
                row=i;
                break;
            }
        }
        System.out.println(row);
        for(int i=0;i<=col ; i++){
            if(matrix[row][i]==target)
                return true;
        }
        return false;
    }
}