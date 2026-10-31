class Solution {

    public int getMax(int lo, int hi,int[] nums) {
        int fInd = -1;
        int lInd = -1;
        int co = 0;
        for(int i = lo ; i < hi ; i++){
            if(nums[i] < 0){
                co++;
                if(fInd == -1)
                    fInd = i;
                lInd = i;
            }
        }
        if(co%2 == 0) {
            if(lo < nums.length) {
                int prod = nums[lo];
                for(int i = lo+1 ; i < hi; i++){
                    prod *=  nums[i];
                }
                return prod;
            }else{
                return 0;
            }
        }else{
            //case 1: lInd - 1 exclude last one.
            int p1 = nums[lo];
            for(int i = lo+1 ; i < lInd; i++){
                p1 *= nums[i];
            }
            //case 2: fInd + 1 exclude first one.
            int p2 = nums[hi-1];
            for(int i = hi-2; i > fInd; i-- ){
                p2 *= nums[i];
            }
            return Math.max(p1,p2);
        }
        

    }

    public int maxProduct(int[] nums) {
        int lo = 0;
        int ans = Integer.MIN_VALUE;
        boolean ze = false;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == 0){
                int prod = getMax(lo,i,nums);
                ans = Math.max(prod,ans);
                lo = i+1;
                ze = true;
            }
        }
        int prod = getMax(lo,nums.length,nums);
        ans = Math.max(prod,ans);
        if(ze && ans < 0)
            ans = 0;
        return ans;
    }
}