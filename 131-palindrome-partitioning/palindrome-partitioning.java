class Solution {
    List<List<String>> ans = new ArrayList<>();

    boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    void dfs(String s,int lo, int hi ,List<String> lst){
        if (hi >= s.length()) {
            if (lo == s.length()) ans.add(new ArrayList<>(lst));
            return;
        }
        // two case partetion and not parteation 
        //case 1 not partetion
        dfs(s,lo, hi+1, lst);

        //case 2: partetion 
        if(isPalindrome(s,lo,hi)) {
            String sub = s.substring(lo,hi+1);
            lst.add(sub);
            dfs(s, hi+1,hi+1,lst);
            lst.remove(lst.size()-1);
        }
    }
    public List<List<String>> partition(String s) {
        dfs(s,0,0,new ArrayList<>());
        return ans;
    }
}