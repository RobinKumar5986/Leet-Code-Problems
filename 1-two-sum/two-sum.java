class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                int[] ans = new int[2];
                ans[0] = map.get(req);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}