class Solution {
    public int findGCD(int[] nums) {
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;
        for(int ele : nums){
            s = Math.min(s,ele);
            l = Math.max(l,ele);
        }
        int rem = l % s;
        while(rem != 0){
            l = s;
            s = rem;
            rem = l % s;
        }
        return s;
    }
}