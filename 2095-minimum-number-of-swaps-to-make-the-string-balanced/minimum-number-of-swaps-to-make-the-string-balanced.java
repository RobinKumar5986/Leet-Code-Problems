class Solution {
    public int minSwaps(String s) {
        if(s.length() == 0)
            return 0;
        int op = 0;
        int cl = 0;
        int swap = 0;
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(c == ']')
                cl++;
            else
                op++;
            if(cl > op){
                cl--;
                op++;
                swap++;
            }
        }
        return swap;
    }
}