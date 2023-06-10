class Solution {
    public int maxValue(int n, int index, int maxSum) {

        long left=index;
        long right=n-index-1;

        long lo=1;
        long hi=maxSum;
        long res=0;
        while(lo<=hi){

            long mid=(hi-lo)/2+lo;
            long rsum=0,lsum=0;
            long ele=mid-1;

            if(ele>=right){
                rsum=(ele*(ele+1))/2 -((ele-right)*(ele-right+1))/2;
            }
            else{
                rsum=(ele*(ele+1))/2 + (right-ele);
            }

            
            if(ele>=left){
                lsum=(ele*(ele+1))/2 -((ele-left)*(ele-left+1))/2;
            }
            else{
                lsum=(ele*(ele+1))/2 + (left-ele);
            }

            long sum=lsum + mid + rsum;
            if(sum<=maxSum){
                lo=mid+1;
                res=mid;
            }else{
                hi=mid-1;
            }
        }
       
       return (int)res;

    }
}