class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])==true){
                return true;
            }
            map.add(nums[i]);
        }
        return false;
    }
}