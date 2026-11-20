class Solution {
    List<List<String>> ans = new ArrayList<>();
    
    int[] isPalindrome(List<String> lst) {
        int total = 0;
        for (String str : lst) {
            total += str.length();
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i++) != str.charAt(j--)) return new int[]{0, total};
            }
        }
        return new int[]{1, total};
    }
    void dfs(String s,int lo, int hi ,List<String> lst){
        if (hi >= s.length()) {
            int[] res = isPalindrome(lst);
            if (res[0] == 1 && res[1] == s.length()) ans.add(new ArrayList<>(lst));
            return;
        }
        // two case partetion and not parteation 
        //case 1 not partetion
        dfs(s,lo, hi+1, lst);

        //case 2: partetion 
        String sub = s.substring(lo,hi+1);
        lst.add(sub);
        dfs(s, hi+1,hi+1,lst);
        lst.remove(lst.size()-1);

    }
    public List<List<String>> partition(String s) {
        dfs(s,0,0,new ArrayList<>());

        return ans;
    }
}