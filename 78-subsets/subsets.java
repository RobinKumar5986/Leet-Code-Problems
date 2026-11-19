class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void dfs(int ind,int[] nums, List<Integer> lst) {
        if(ind >= nums.length){
            ans.add(new ArrayList<>(lst));
            return;
        }
        dfs(ind+1, nums, lst);

        lst.add(nums[ind]);
        dfs(ind + 1, nums, lst);
        lst.remove(lst.size() - 1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0,nums,new ArrayList<>());

        return ans;
    }
}