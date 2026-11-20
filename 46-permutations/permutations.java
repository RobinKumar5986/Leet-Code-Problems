class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void dfs(List<Integer> lst, int[] nums, boolean[] used){
        if(lst.size() == nums.length){
            ans.add(new ArrayList<>(lst));
            return;
        }

        for(int i = 0 ; i < nums.length; i++){
            if(!used[i]){
                used[i] = true;
                lst.add(nums[i]);
                dfs(lst,nums,used);
                lst.remove(lst.size()-1);
                used[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        dfs(new ArrayList<>(), nums, used);

        return ans;
    }
}