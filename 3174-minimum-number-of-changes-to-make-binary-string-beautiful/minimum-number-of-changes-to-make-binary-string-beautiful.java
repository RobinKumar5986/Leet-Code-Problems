class Solution {
    public int minChanges(String s) {
        int ch = 0;
        for(int i = 0 ; i < s.length() ; i+=2){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            if(c1 != c2)
                ch++;
        }
        return ch;
    }
}