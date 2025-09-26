class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            if(!set.add(ele))
                return true;
        }
        return false;
    }
}