class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            if(i>0 && nums[i-1]==nums[i])
                continue;
            int lo=i+1;
            int hi=nums.length-1;
            while(lo<hi){
                if(nums[i]+nums[lo]+nums[hi]==0){
                    List<Integer> lst=new ArrayList<>();
                    lst.add(nums[i]);
                    lst.add(nums[lo]);
                    lst.add(nums[hi]);
                    ans.add(lst);
                    while(lo+1 < nums.length && nums[lo]==nums[lo+1])
                        lo++;
                    while(hi-1 >=0 && nums[hi]==nums[hi-1])
                        hi--;
                }
                if(nums[i]+nums[lo]+nums[hi]<0)
                    lo++;
                else
                    hi--;
            }
        }
        return ans;
    }
}