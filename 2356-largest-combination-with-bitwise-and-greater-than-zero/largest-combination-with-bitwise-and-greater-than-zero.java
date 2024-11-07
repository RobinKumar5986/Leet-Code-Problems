import java.math.BigInteger;
class Solution {
    public int largestCombination(int[] candi) {
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int ele : candi)
            max = Math.max(ele,max);
        int bitLength = BigInteger.valueOf(max).bitLength();
        int[] bitMap = new int[bitLength];

        for(int ele : candi){
            int ind = bitLength - 1;
            while(ele != 0){
                int bit = ele & 1;
                if(bit == 1){
                    bitMap[ind]++;
                }
                ind--;
                ele >>= 1;
            }
        }
        for(int ele : bitMap){
            ans = Math.max(ele,ans);
        }
        return ans;
    }
}