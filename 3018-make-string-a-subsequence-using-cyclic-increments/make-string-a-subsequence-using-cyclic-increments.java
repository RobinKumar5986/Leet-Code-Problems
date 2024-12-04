class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        if(str2.length() > str1.length())
            return false;
        int j = 0;
        for(int i = 0 ; i < str1.length() ;i++){
            int num = ((str1.charAt(i) - 'a') + 1 ) % 26;
            if(str1.charAt(i) == str2.charAt(j) || num == (str2.charAt(j) -'a')){
                j++;
            }
           
            if(j == str2.length())
                return true;
        }
        return false;
    }
}