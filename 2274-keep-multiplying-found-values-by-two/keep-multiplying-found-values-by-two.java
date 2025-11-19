class Solution {
    public int findFinalValue(int[] nums, int org) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        while(set.contains(org)){
            org = org << 1;                
        }
        return org;
    }
}