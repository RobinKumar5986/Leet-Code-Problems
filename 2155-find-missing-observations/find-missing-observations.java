class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans = new int[n];
        int sum = 0;
        for(int ele : rolls)
            sum+=ele;
        int m = rolls.length;

        int x = ( ( mean * ( n+m ) ) - sum ) / n;
        int rem = ( ( mean * ( n+m) ) - sum ) % n;

        if(x > 6 || x <=0 )
            return new int[0];
        int req = 6 - x;
        for(int i = 0 ; i < n ; i++){
            ans[i] = x;
            if(rem > 0){
                if(rem >= req){
                    ans[i] = 6;
                    rem -= req;
                }else{
                    ans[i] += rem;
                    rem = 0;
                }
            }
        }
        if(rem > 0)
            return new int[0];
        return ans;
    }
}