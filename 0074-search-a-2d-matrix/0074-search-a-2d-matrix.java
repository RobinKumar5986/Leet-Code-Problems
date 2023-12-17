class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //finding the row using binary search
        int row=0;
        int top=0;
        int bot=matrix.length-1;
        while(top<=bot){
            int mid=(top+bot)/2;
            if(target < matrix[mid][0]){
                bot=mid-1;
            }else if(target > matrix[mid][matrix[0].length-1]){
                top =mid+1;
            }else if(target >= matrix[mid][0] && target <= matrix[mid][matrix[0].length-1] ){
                row=mid;
                break;
            }
        }
        int lo=0;
        int hi=matrix[0].length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid] < target) lo=mid+1;
            else hi=mid-1;
        }
        return false;
    }
}