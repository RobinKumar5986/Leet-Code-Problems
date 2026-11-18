class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        String s = Integer.toBinaryString(n);
        for(char c : s.toCharArray()){
            if(c == '1')ans++;
        }
        return ans;
    }
}