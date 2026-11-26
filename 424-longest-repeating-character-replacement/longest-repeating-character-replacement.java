class Solution {
    int maxlen(char target, int k, String s){
        int lo = 0;
        int len = 0;
        int i = 0;
        for( i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != target){
                while(k == 0){
                    if(s.charAt(lo) != target)
                        k++;
                    lo++;
                }
                k--;
            }
            len = Math.max(len,i-lo+1);
        }
        len = Math.max(len,i-lo);
        return len;
    }
    public int characterReplacement(String s, int k) {
        boolean[] seen = new boolean[26];
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(seen[c-'A'])
                continue;
            seen[c-'A'] = true;
            int len = maxlen(c,k,s);
            ans = Math.max(ans,len);
        }

        return ans; //max time complexity 10^5 * 26
    }

}