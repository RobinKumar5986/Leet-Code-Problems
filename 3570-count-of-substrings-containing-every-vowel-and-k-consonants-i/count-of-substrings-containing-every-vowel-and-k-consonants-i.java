class Solution {
    public int countOfSubstrings(String word, int k) {
        int ans = 0;
        for(int i = 0 ; i < word.length(); i++){
            int a = 0, e = 0, i_c = 0 , o = 0 , u = 0, ko = 0;
            for(int j = i; j < word.length(); j++){
                char ch = word.charAt(j);
                if(ch == 'a') a++;
                else if ( ch == 'e') e++;
                else if ( ch == 'i') i_c++;
                else if ( ch == 'o') o++;
                else if ( ch == 'u') u++;
                else ko++;
                if(a > 0 && e > 0 && i_c > 0 && o > 0 && u > 0 && ko == k)
                    ans++;
            }
        }
        return ans;
    }
}