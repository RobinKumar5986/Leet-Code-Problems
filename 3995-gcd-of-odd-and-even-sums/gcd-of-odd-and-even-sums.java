class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oSum = 0;
        int eSum = 0;
        int o = 1;
        int e = 2;
        for(int i = 0 ; i < n ; i++) {
            oSum += o;
            eSum += e;
            o += 2;
            e += 2;
        }
        //gcd 
        int ans = 1;
        for(int i = 2; i <= Math.min(oSum,eSum) ; i++){
            if(i > oSum || i > eSum ) break;
            if(oSum % i != 0 || eSum % i != 0 ) continue;
            int co = 0;
            
            while(oSum % i == 0 && eSum % i == 0){
                co ++;
                oSum = oSum/i;
                eSum = eSum/i;
            }
            ans *= Math.pow(i,co);
            
        }
        return ans;
    }
}