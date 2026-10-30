class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }
            List<Integer> lst = map.get(nums[i]);
            lst.add(i);
            map.put(nums[i], lst);
        }
        for(int i = 0 ; i < nums.length; i++){
            int n = target - nums[i];
            if(n == nums[i]){
                List<Integer> ind = map.get(n);
                if(ind.size() >= 2){
                    return new int[]{ind.get(0), ind.get(1)};
                }
            }
            else if(n != nums[i] && map.containsKey(n)){
                return new int[]{ i , map.get(n).get(0)};
            }
        }
        return new int[]{-1,-1};
    }
}