class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++) {
            int ind = Math.abs(nums[i]);
            ind = ind-1;
            if(nums[ind] < 0) {
                ans.add(ind+1);
            }
            nums[ind] = -1 * nums[ind];
        }
        return ans;
    }
}