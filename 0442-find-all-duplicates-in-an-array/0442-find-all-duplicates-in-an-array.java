class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res =new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                res.add(nums[i]);
            }
            else{
                map.put(nums[i],1);
            }
        }
        return res;
    }
}