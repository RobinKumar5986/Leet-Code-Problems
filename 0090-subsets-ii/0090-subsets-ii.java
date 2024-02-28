class Solution {
    void subset(int[] nums,List<List<Integer>> ans,List<Integer> temp,int ind){
        if(ind==nums.length){
            List<Integer> nTemp=new ArrayList<>(temp);
            Collections.sort(nTemp);
            if(!ans.contains(nTemp))
                ans.add(nTemp);
            return;
        }
        temp.add(nums[ind]);
        subset(nums,ans,temp,ind+1);

        temp.remove(temp.size()-1);
        subset(nums,ans,temp,ind+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        subset(nums,ans,new ArrayList<>(),0);
        return ans;
    }
}