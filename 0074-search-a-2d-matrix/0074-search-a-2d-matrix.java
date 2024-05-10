class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int lo=0;
        int row=mat.length;
        int col=mat[0].length;

        int hi=row*col-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mat[mid/col][mid%col]==target)
                return true;
            else if(mat[mid/col][mid%col]<target)
                lo=mid+1;
            else 
                hi=mid-1;
        }
        return false;
    }
}