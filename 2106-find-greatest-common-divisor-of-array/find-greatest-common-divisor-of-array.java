class Solution {
    public int findGCD(int[] nums) {
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;
        for(int ele : nums){
            s = Math.min(s,ele);
            l = Math.max(l,ele);
        }

        while( l != 0){
            int temp = s % l;
            s = l;
            l = temp;
        }
        return s;
    }
}