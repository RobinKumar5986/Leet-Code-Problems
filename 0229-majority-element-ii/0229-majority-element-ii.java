class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n_by_3=nums.length/3;
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]) ){
                map.put(nums[i],1);

                if( map.get(nums[i]) > n_by_3 && !ans.contains(nums[i] )) ans.add(nums[i]);
            }else{
                map.put(nums[i] , map.get(nums[i]) + 1);

                if( map.get(nums[i]) > n_by_3 && !ans.contains(nums[i] )) ans.add(nums[i]);
            }
        }
        return ans;
    }
}