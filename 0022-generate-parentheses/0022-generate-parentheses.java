class Solution {
    List<String> ans = new ArrayList<>();

    void dfs(int n, int l, int r, StringBuilder sb) {
        if (r + l == 2 * n) {
            ans.add(new String(sb) );
            return;
        }
        if (l < n) {
            StringBuilder sb1 = new StringBuilder(sb);
            sb1.append("(");
            dfs(n, l + 1, r, sb1);
        }
        if (r < l) {
            StringBuilder sb2 = new StringBuilder(sb);
            sb2.append(")");
            dfs(n, l, r + 1, sb2);
        }
    }

    public List<String> generateParenthesis(int n) {
        dfs(n, 1, 0, new StringBuilder("("));
        return ans;
    }
}
