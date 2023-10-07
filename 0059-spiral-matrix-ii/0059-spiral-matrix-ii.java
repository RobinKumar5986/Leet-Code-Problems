public class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]=new int [n][n];
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=n-1;
        int c=1;
        while(top<=bottom && left<=right){
            for(int i=left ;i <= right ;i++){
                ans[top][i]=c;
                c++;
            }
            top++;
            for(int i=top ;i <= bottom ;i++){
                ans[i][right]=c;
                c++;
            }
            right--;
            
            for(int i=right ;i >= left ;i--){
                ans[bottom][i]=c;
                c++;
            }
            bottom--;

            for(int i=bottom ;i >= top ;i--){
                ans[i][left]=c;
                c++;
            }
            left++;
        }
        return ans;
    }
}