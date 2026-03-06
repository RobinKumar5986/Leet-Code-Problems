class Solution {
    public boolean checkOnesSegment(String s) {
        int co = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                co++;
                while( i < s.length() && s.charAt(i) == '1') {
                    i++;
                }
            }

        }
        return co == 1 ? true : false;
    }
}