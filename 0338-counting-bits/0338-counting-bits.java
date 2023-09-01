class Solution {
    int binCount(int n){
        int count=0;
        while(n!=0){
            int rem=n%2;
            if(rem==1) count++;

            n=n/2;
        }
        return count;
    }
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=binCount(i);

            // System.out.println(ans[i]);
        }
        
        return ans;
    }
}