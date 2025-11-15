class Solution {
    val vis = IntArray(101){-1}

    fun dfs(ind: Int, nums: IntArray): Int {
        if(ind >= nums.size){
            return 0;
        }
        if(vis[ind] != -1){
            return vis[ind];
        }
        //not rob
        val left = dfs(ind+1,nums);
        //rob
        val right =  nums[ind] + dfs(ind + 2,nums);

        val max = Math.max(left,right); 
        vis[ind] = max;
        return vis[ind];
    }
    fun rob(nums: IntArray): Int {
        return dfs(0,nums);
    }
}