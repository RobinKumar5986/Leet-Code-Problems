class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int[] map=new int[100001];
        for(int i=0;i<nums.length;i++){
            if(map[nums[i]] ==1) {
                ans.add(nums[i]);
            }else{
                map[nums[i]]=1;
            }
        }
        return ans;
    }
}