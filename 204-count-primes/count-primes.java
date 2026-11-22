class Solution {
    public int countPrimes(int n) {
        if(n <= 2 ) return 0;
        
        boolean[] seen = new boolean[n];
        int ans = 0;
        for(int i = 2; i < n; i++){
            if(!seen[i]){
                int mul = i;
                ans++;
                while(mul < n){
                    seen[mul] = true;
                    mul = mul + i;
                }
            }
        }

        return ans;

    }
}