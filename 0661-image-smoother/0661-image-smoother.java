class Solution {
    public int[][] imageSmoother(int[][] img) {
        
        int m=img.length;
        int n=img[0].length;
        int[][] ans=new int[m][n];

        for(int i=0;i < m ;i++){
            for(int j=0; j < n ; j++){
                int count=0;
                int sum=0;
                for(int x=i-1 ; x <= i+1; x++){
                    for(int y=j-1 ; y <=j+1;y++){

                        if( x >=0 && x < m && y>=0 && y<n){
                            count++;
                            sum +=img[x][y];
                        }
                    }
                }
    
                ans[i][j]=sum/count;
            }
        }

        return ans;
    }
}