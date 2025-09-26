class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        return set.size() != nums.length;
    }
}