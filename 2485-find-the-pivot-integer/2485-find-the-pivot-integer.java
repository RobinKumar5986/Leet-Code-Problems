class Solution {
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        int tsum=0;
        for(int i=1;i<=n;i++){
            tsum+=i;
            if(tsum==(sum-tsum+i))
                return i;
        }
        return -1;

    }
}