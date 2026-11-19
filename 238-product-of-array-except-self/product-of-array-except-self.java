class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        int m1 = 1;
        int m2 = 1;
        int[] ans = new int[nums.length];
        for(int i = 0, j = nums.length-1; i < nums.length; i++,j--){
            m1 = m1 * nums[i];
            l[i] = m1;
            
            m2 = m2 * nums[j];
            r[j] = m2;
        }
        
        for(int i = 0 ; i < nums.length; i++){
            int mul = 1;
            if(i - 1 >= 0)
                mul *= l[i-1];
            if(i+1 < nums.length)
                mul *= r[i+1];
            ans[i] = mul;
        }
        return ans;
    }
}