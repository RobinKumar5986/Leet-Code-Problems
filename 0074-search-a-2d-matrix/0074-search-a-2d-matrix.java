class Solution {
    boolean secBin(int[] row,int lo,int hi,int t){
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(row[mid]==t)
                return true;
            else if(row[mid]>t)
                hi=mid-1;
            else
                lo=mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int t) {
        int lo=0;
        int hi=mat.length-1;
        int len=mat[0].length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(t>=mat[mid][0] && t<=mat[mid][len]){
                return secBin(mat[mid],0,len,t);
            }else if(mat[mid][0]>t){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return false;
    }
}