class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                return new int[]{i, map.get(req)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}