class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void generate(int[] nums,int ind,List<Integer> sub){
        if(ind==nums.length){
            ans.add(sub);
            return;
        }
        List<Integer> temp=new ArrayList<>(sub);
        temp.add(nums[ind]);
        generate(nums,ind+1,temp);
        generate(nums,ind+1,sub);
    }
    public List<List<Integer>> subsets(int[] nums) { 
        generate(nums,0,new ArrayList<>());
        return ans;
    }
}