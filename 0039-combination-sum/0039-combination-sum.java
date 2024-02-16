class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void dfs(int[] arr,int ind,int sum,int target,List<Integer> sub){
        if(sum==target){
            ans.add( new ArrayList<>(sub) );
            return;
        }
        if(sum>target || ind == arr.length)
            return;
        sub.add(arr[ind]);
        dfs(arr,ind,sum+arr[ind],target,sub);
        sub.remove(sub.size()-1);
        dfs(arr,ind+1,sum,target,sub);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates,0,0,target,new ArrayList<>());
        return ans;
    }
}