class Solution {
    public int findFinalValue(int[] nums, int org) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        while(true){
            if(set.contains(org))
                org = org << 1;
            else
                return org;
        }
    }
}