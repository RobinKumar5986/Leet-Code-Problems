class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> lst = new ArrayList<>();
    boolean[] used;
    void dfs(int[] nums){
        if(lst.size() == nums.length){
            ans.add(new ArrayList<>(lst));
            return;
        }

        for(int i = 0 ; i < nums.length; i++){
            if(!used[i]){
                used[i] = true;
                lst.add(nums[i]);
                dfs(nums);
                lst.remove(lst.size()-1);
                used[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        dfs(nums);
        return ans;
    }
}