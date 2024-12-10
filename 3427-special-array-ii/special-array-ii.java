class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] q) {
        int[] bad = new int[nums.length];
        for(int i = 0 ; i<nums.length-1; i++){
            if(nums[i]%2==nums[i+1]%2){
                bad[i+1] = 1;
            }
        }
       
        //prefix sum
        for(int i = 1 ; i < nums.length ; i++){
            bad[i] += bad[i-1];
        }
        boolean[] ans = new boolean[q.length];
        int ind = 0;
        for(int[] ele : q){
            int lo = ele[0];
            lo++;
            int hi = ele[1];
            int count = bad[hi] - (lo > 0 ? bad[lo - 1] : 0);
 
            if(count > 0){
                ans[ind] = false;
            }else{
                ans[ind] = true;
            }
            ind++;
        }
        return ans;
    }
}