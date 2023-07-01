class Solution {
    int ans;
    int count[];

    public int distributeCookies(int[] cookies, int k) {
        ans=Integer.MAX_VALUE;
        count=new int[k];
        solve(0,cookies,k);
        return ans;
    }

    public void solve(int cookiNumber, int[] cookies,int k){
        if(cookiNumber==cookies.length){
            int max=0;
            for(int i=0;i<k;i++){
                max=Math.max(max,count[i]);
            }
            ans=Math.min(ans,max);

            return;

        }



        for(int i=0;i<k ; i++){
            count[i]+=cookies[cookiNumber];

            solve(cookiNumber+1 , cookies , k);

            count[i]-=cookies[cookiNumber];

            if(count[i]==0) break;

        }
    }
}