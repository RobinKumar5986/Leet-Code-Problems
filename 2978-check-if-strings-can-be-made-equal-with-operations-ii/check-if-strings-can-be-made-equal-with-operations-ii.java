class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] odd = new int[26];
        int[] even = new int[26];

        for(int i = 0 ; i < s1.length(); i++){
            int c1 = s1.charAt(i) - 'a';
            int c2 = s2.charAt(i) - 'a';
            if(i % 2 == 0) {
                even[c1]++;
                even[c2]--;
            }else{
                odd[c1]++;
                odd[c2]--;
            }
        }
        for(int i = 0 ; i < 26 ; i++){
            if(odd[i] != 0 || even[i] != 0)
                return false;
        }
        return true;
        
    }
}