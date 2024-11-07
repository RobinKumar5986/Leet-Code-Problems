class Solution {
    public int largestCombination(int[] candi) {
        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int ele : candi)
            max = Math.max(ele,max);
        String bin = Integer.toBinaryString(max);
        int[] bitMap = new int[bin.length()];

        for(int ele : candi){
            int ind = bin.length()-1;
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