class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void dfs(int[] nums,int start, int rem,List<Integer> lst){
        if(rem == 0){
            ans.add(new ArrayList<>(lst));
            return;
        }
        if(rem < 0)
            return;
        for(int i = start;i < nums.length; i++){
            lst.add(nums[i]);
            dfs(nums,i,rem - nums[i],lst);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int t) {
        dfs(nums,0,t,new ArrayList<>());
        return ans;
    }
}