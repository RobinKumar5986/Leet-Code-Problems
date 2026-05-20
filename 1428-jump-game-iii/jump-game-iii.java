class Solution {
    boolean[] vis;
    boolean canReach = false;

    void dfs(int[] arr,int ind){
        if( ind < 0 || ind >= arr.length)
            return;
        if(vis[ind] || canReach)
            return;
        vis[ind] = true;

        if(arr[ind] == 0 ) canReach = true;

        
        dfs(arr,ind+arr[ind]);
        
        dfs(arr,ind-arr[ind]);
       
    }
    public boolean canReach(int[] arr, int start) {
        vis = new boolean[arr.length];
        dfs(arr,start);

        return canReach;

    }
}