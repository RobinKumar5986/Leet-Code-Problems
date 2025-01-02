class Solution {
    public int[] vowelStrings(String[] w, int[][] q) {
        int[] pfx = new int[w.length];
        int[] ans = new int[q.length];
        boolean[] vowels = new boolean[26];
        vowels['a' - 'a'] = true;
        vowels['e' - 'a'] = true;
        vowels['i' - 'a'] = true;
        vowels['o' - 'a'] = true;
        vowels['u' - 'a'] = true;
        for(int i = 0 ; i < w.length ;i++){
            String s = w[i];
            char f = s.charAt(0);
            char l = s.charAt(s.length()-1);
            if(vowels[f - 'a'] && vowels[l - 'a']){
                if(i == 0){
                    pfx[i] = 1;
                }else{
                    pfx[i] = pfx[i-1] + 1;
                }
            }else if(i!=0){
                pfx[i] = pfx[i-1];
            }
        }
        for(int i = 0 ; i < q.length ; i++){
            int lo = q[i][0];
            int hi = q[i][1];
            if( lo == 0){
                ans[i] = pfx[hi];
            }else{
                ans[i] = pfx[hi] - pfx[lo-1];
            }
        }
        return ans;
    }
}