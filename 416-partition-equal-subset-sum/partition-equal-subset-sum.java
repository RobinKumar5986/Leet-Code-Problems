class Solution {
    Map<String,Boolean> map = new HashMap<>();
    boolean ans = false;
    boolean dfs(int ind,int[] nums,int total,int sum){
        String key = ind + ":" + sum;
        if(ans) return true;
        if(sum == total/2) return true;
        if(ind >= nums.length) return false;
        
        if(map.containsKey(key)){
           return map.get(key);
        }
        
        //case not include
        boolean c1 = dfs(ind+1,nums,total,sum);
        //include
        boolean c2 = dfs(ind+1,nums,total,sum + nums[ind]);
        boolean reach = c1 || c2;


        if(reach){
            ans = true;
            map.put(key,true);
        }else{
            map.put(key,false);
        }
        return reach;
    }
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int ele : nums) total += ele;
        if(total % 2 != 0) return false;

        return dfs(0,nums,total,0);
    }
}