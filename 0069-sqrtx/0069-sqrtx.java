class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
    
        long l=0;
        long r=x;
        int ans=0;
        while(l<=r){
            long mid=(l+r)/2;
            long sqr=mid*mid;
            if(sqr==x){
                return (int)mid;
            }else if(sqr<x){
                l=mid+1;
                ans=(int)mid;
            }else{
                r=mid-1;
            }   
        }
        return ans;

    }
}