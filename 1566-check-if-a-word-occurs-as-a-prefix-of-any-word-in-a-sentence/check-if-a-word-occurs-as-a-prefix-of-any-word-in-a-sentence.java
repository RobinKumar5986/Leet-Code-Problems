class Solution {
    public int isPrefixOfWord(String sen, String pre) {
        boolean flag = true;
        int ind = 0;
        int ans = 1;
        for(int i = 0;i<sen.length();i++){
            if(flag && sen.charAt(i) == pre.charAt(ind)){
                ind++;
            }else{
                flag = false;
                ind = 0;
            }
            if(ind == pre.length())
                return ans;
            if(sen.charAt(i) == ' '){
                flag = true;
                ind = 0;
                ans++;
            }
        }
        return -1;
    }
}