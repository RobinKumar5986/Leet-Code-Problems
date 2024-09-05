class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans = new int[n];
        int sum = 0;
        for(int ele : rolls)
            sum+=ele;
        int m = rolls.length;

        int x = ( ( mean * ( n+m ) ) - sum ) / n;
        int rem = ( ( mean * ( n+m) ) - sum ) % n;

        System.out.print(x+ " : " + rem);
        if(x > 6 || x <=0 )
            return new int[0];
        for(int i = 0 ; i < n ; i++){
            ans[i] = x;
        }
        int ind = 0;
        while(rem > 0 ){
            if(ind >= n)
                ind = 0;
            ans[ind]+=1;
            if(ans[ind] > 6)
                return new int[0];
            rem--;
            ind++;
        }

        return ans;
    }
}