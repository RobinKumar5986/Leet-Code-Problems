class Solution {
    Set<String> set = new HashSet<>();
    boolean isFound = false;
    String ans = "";

    void dfs(String cur, int ind,int n){
        if(isFound){
            return;
        }
        if(ind == n){
            if(cur.length() == n && !set.contains(cur)){
                isFound = true;
                ans = cur;
            }
            return;
        }
        //Two choices '0' or '1'
        dfs(cur + "0" , ind+1, n);
        dfs(cur + "1" , ind+1, n);

    }
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        for(String ele : nums)
            set.add(ele);
        dfs("",0,n);
        return ans;
    }
}