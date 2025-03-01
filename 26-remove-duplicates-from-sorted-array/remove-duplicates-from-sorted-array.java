class Solution {
    public int removeDuplicates(int[] nums) {
        int unique[] = new int[nums.length];
        int co = 0;
        for(int i = 0 ; i < nums.length; i++){
            unique[co] = nums[i];
            co++;
            while(i+1 < nums.length && nums[i] == nums[i+1]){
                i++;
            }
        }
        for(int i = 0 ; i <co ; i++){
            nums[i] = unique[i];
        }
        return co;
    }
}