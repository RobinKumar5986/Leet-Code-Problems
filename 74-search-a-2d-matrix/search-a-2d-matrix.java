class Solution {
    public boolean isInRow(int lo, int hi,int row ,int target, int[][] mat){
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(mat[row][mid] == target){
                return true;
            }
            if(mat[row][mid] < target){
                lo = mid+1;
            }else{
                hi = mid - 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat , int target) {
        //Objective: find the targer...
        //1.Find the row in which it can be present 
        //2.Check if in that row is it present ?
        int lo = 0;
        int hi = mat.length-1;
        int len = mat[0].length-1;

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(target >= mat[mid][0] && target <= mat[mid][len]){
                return isInRow(0,len,mid,target,mat);
            }
            if(target < mat[mid][0]){
                hi = mid-1;
            }
            if(target > mat[mid][len]){
                lo = mid+1;
            }
        }
        return false;
    }
}