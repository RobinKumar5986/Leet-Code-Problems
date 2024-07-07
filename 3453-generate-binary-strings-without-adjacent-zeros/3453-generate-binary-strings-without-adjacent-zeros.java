class Solution {
    List<String> ans = new ArrayList<>();

    void genAll(int ind, String str, int len) {
        if (str.length() == len) {
            ans.add(str);
            return;
        }
        // Add '0' only if the previous character is not '0'
        if (str.length() == 0 || str.charAt(str.length() - 1) != '0') {
            genAll(ind + 1, str + "0", len);
        }
        // Always add '1'
        genAll(ind + 1, str + "1", len);
    }

    public List<String> validStrings(int n) {
        genAll(0, "", n);
        return ans;
    }
}
