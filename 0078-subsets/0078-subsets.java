class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void allSub(int[] nums,int ind,List<Integer> lst){
        if(ind==nums.length){
            if(!ans.contains(lst))
                ans.add(new ArrayList<>(lst));
            return;
        }
        allSub(nums,ind+1,lst);
        lst.add(nums[ind]);
        allSub(nums,ind+1,lst);
        lst.remove(lst.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        allSub(nums,0,new ArrayList<>());
        return ans;
    }
}