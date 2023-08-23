class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res =new ArrayList<>();
        HashSet<Integer> map=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(map.contains(nums[i])){
                res.add(nums[i]);
            }
            else{
                map.add(nums[i]);
                
            }
        }
        return res;

    }
}