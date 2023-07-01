class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int hi=cardPoints.length-1;
        int sum=0;
        int max=0;
        int sum2=0;

        for(int i=0;i<k;i++){
            // sum2+=cardPoints[hi-i];
            sum+=cardPoints[i];
        }
        k--;
        int n=k;
        int j=0;
        // if(sum2>sum){
        //     max=sum2;
        // }else{
            max=sum;
        // }

        for(int i=k;k>=0;k--){
            sum+=cardPoints[hi-j] - cardPoints[k];
            if(sum>max){
                max=sum;
            }
            j++;
        }
        // sum+=cardPoints[hi-n];

        // if(sum>max) max=sum; 

        return max;
    }
}