class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int co=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            else{
                map.put(nums[i],map.get(nums[i]) + 1 );
                co+=map.get(nums[i]);
            }
        }
        return co;
    }
}