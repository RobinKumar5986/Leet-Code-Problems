class Solution {
    List<List<String>> ans = new ArrayList<>();
    Map<String, Boolean> seen = new HashMap<>();
    boolean isPalindrome(String str) {
        if(seen.containsKey(str))
            return seen.get(str);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                seen.put(str,false);
                return false;
            }
        }
        seen.put(str,true);
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
        String sub = s.substring(lo,hi+1);
        if(isPalindrome(sub)) {
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