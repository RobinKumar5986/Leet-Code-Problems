class Solution {
    public int findFinalValue(int[] nums, int org) {
        boolean[] set = new boolean[1001];
        for (int n : nums) set[n] = true;
        while(org < 1001 && set[org]){
            org = org << 1;                
        }
        return org;
    }
}