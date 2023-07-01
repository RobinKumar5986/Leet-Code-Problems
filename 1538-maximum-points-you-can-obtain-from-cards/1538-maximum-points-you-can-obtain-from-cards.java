class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int hi=cardPoints.length-1;
        
        int sum=0;
        int max=0;

        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        k--;
        int n=k;
        int j=0;
   
        max=sum;


        for(int i=k;k>=0;k--){
            sum+=cardPoints[hi-j] - cardPoints[k];
            if(sum>max){
                max=sum;
            }
            j++;
        }
        return max;
    }
}