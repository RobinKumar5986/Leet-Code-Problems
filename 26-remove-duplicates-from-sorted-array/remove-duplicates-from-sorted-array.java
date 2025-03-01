class Solution {
    public int removeDuplicates(int[] nums) {
        int unique[] = new int[nums.length];
        int co = 0;
        for(int i = 0 ; i < nums.length; i++){
            nums[co] = nums[i];
            co++;
            while(i+1 < nums.length && nums[i] == nums[i+1]){
                i++;
            }
        }
        return co;
    }
}