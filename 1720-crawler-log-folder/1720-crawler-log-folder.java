class Solution {
    public int minOperations(String[] logs) {
        int ans=0;
        for(String ele : logs){
            if(ele.equals("../") && ans >0)
                ans--;
            else if(!ele.equals("./") && !ele.equals("../"))
                ans++;
        }
        return ans;
    }
}