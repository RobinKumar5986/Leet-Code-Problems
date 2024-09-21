class Solution {
    public int bitwiseComplement(int n) {
        int ans = 0;
        String s = Integer.toBinaryString(n);
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == '0'){
                ans += Math.pow(2,s.length() -1 - i );
            }
        }
        return ans;
    }
}