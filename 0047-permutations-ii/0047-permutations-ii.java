class Solution {
    private void backtracking(int[] nums,List<List<Integer>> ans,boolean[] used,List<Integer> temp){
        if(nums.length==temp.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i] || (i>0 && nums[i]==nums[i-1] && !used[i-1]))
                continue;

            temp.add(nums[i]);//add
            used[i]=true;

            backtracking(nums,ans,used,temp);//backtrack

            temp.remove(temp.size()-1); //try different value
            used[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums.length<=0) 
            return new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(nums);

        boolean used[]=new boolean[nums.length];

        backtracking(nums,ans,used,new ArrayList<>());
        return ans;
    }
}