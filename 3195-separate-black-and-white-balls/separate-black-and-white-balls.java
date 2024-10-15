class Solution {
    public long minimumSteps(String s) {
        long ans = 0;
        int ind = -1;
        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(ind == -1 && c == '0')
                continue;
            if(c == '1' && ind == -1)
                ind = i;
            if(c == '0'){
                ans += i - ind;
                ind++;
            }
        }
        return ans;
    }
}