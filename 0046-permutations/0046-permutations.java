class Solution {
    private void backtrack(int[] nums,List<List<Integer>> ans,List<Integer> temp){
        if(nums.length==temp.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int ele : nums){
            if(temp.contains(ele))
                continue;

            temp.add(ele);

            backtrack(nums,ans,temp);

            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
         if(nums == null || nums.length == 0) return new ArrayList<>();
         
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,ans,new ArrayList<>() );
        return ans;
    }
}