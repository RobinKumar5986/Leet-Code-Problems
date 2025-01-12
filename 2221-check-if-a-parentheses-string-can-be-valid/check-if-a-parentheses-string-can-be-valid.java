class Solution {
    public boolean canBeValid(String s, String l) {
        if (s.length() % 2 != 0) {
            return false;
        }

        int op = 0;
        int cl = 0;
        for(int i = 0 ; i<s.length() ;i++){
            char c = s.charAt(i);
            char b = l.charAt(i);
            if( b == '0' || c == '(')
                op++;
            else
                op--;
            if(op < 0)
                return false;
        }
      for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            char b = l.charAt(i);
            if( b == '0' || c == ')')
                cl++;
            else
                cl--;
            if(cl<0)
                return false;
        }
        return true;
    }
}