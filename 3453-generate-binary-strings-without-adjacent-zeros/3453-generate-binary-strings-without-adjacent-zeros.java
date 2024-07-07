class Solution {
    List<String> ans = new ArrayList<>();

    void genAll(int ind, String str, int len) {
        if (str.length() == len) {
            ans.add(str);
            return;
        }
        if (str.length() == 0 || str.charAt(str.length() - 1) != '0') {
            genAll(ind + 1, str + "0", len);
        }
        genAll(ind + 1, str + "1", len);
    }

    public List<String> validStrings(int n) {
        genAll(0, "", n);
        return ans;
    }
}
