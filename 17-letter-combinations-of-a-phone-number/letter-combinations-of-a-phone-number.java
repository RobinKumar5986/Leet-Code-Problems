class Solution {
    char[][] map = {
        {'a', 'b', 'c'},    // 0
        {'d', 'e', 'f'},    // 1
        {'g', 'h', 'i'},    // 2
        {'j', 'k', 'l'},    // 3
        {'m', 'n', 'o'},    // 4
        {'p', 'q', 'r', 's'}, // 5
        {'t', 'u', 'v'},    // 6
        {'w', 'x', 'y', 'z'} // 7
    };
    List<String> ans = new ArrayList<>();

    void generator(String digs, int ind,String comb){
        if(ind >= digs.length()){
            ans.add(comb);
            return;
        }
        int dig = digs.charAt(ind)+ - '0' - 2;
        char[] s = map[dig];
        for(char c : s){
            generator(digs,ind+1,comb+c);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return ans;
        generator(digits,0, "");
        return ans;
    }
}