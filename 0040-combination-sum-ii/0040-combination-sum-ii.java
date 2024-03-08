class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void dfs(int[] candi,int t,int ind,List<Integer> temp){
        if(t==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(t<0 || ind>=candi.length)
            return;
        for(int i=ind;i<candi.length;i++){
            if(i>ind && candi[i]==candi[i-1])
                continue;
            temp.add(candi[i]);
            dfs(candi, t-candi[i], i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,target,0,new ArrayList<>());
        return ans;
    }
}