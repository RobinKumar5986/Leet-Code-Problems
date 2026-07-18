class Solution {
    public int findGCD(int[] nums) {
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;
        for(int ele : nums){
            s = Math.min(s,ele);
            l = Math.max(l,ele);
        }

        int ans = 1;
        for(int i = 1 ; i <= l ; i++){
            if(i > s ) break;
            double v1 = (double)s / i;
            double v2 = (double)l / i;
            if((int) v1 == v1 && (int)v2 == v2){
                ans = i;
            }
        }
        return ans;
    }
}