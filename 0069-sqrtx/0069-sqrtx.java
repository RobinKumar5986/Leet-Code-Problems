class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
    
        int l=0;
        int r=x;
        int ans=0;
        while(l<=r){
            long mid=(l+r)/2;
            long sqr=mid*mid;
            if(sqr==x){
                return (int)mid;
            }else if( sqr < x){
                l=(int)mid+1;
                ans=(int)mid;
            }else{
                r=(int)mid-1;
            }   
        }
        return ans;
    }
}