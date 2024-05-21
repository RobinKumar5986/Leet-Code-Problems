class Solution {
    public void generate(List<List<Integer>> ans,int[] nums,int ind,List<Integer> sub){
        if(ind==nums.length){
            ans.add(new ArrayList<>(sub));
            return;
        }
        generate(ans,nums,ind+1,sub);
        sub.add(nums[ind]);
        
        generate(ans,nums,ind+1,sub);
        sub.remove(sub.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>(); 
        generate(ans,nums,0,new ArrayList<>());
        return ans;
    }
}