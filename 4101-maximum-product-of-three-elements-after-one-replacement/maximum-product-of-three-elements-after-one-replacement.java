class Solution {
    public long maxProduct(int[] nums) {
        int m1 = Integer.MIN_VALUE;
        int m2 = m1;
        for(int val : nums){
            int ele = Math.abs(val);
            if(ele > m1){
                m2 = m1;
                m1 = ele;
            }else if(ele > m2){
                m2 = ele;
            }
        }
        long ans = (long)m1 * (long)m2 * 100000l;
        return ans;
    }
}