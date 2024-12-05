class Solution {
    public boolean canChange(String s, String t) {
        int sId = 0,tId = 0;
        int n = s.length();

        while(sId < n || tId < n){
            while(sId < n && s.charAt(sId) == '_') sId++;
            while(tId < n && t.charAt(tId) == '_') tId++;

            if(sId == n && tId == n) return true;
            if(sId == n || tId == n) return false;

            if (s.charAt(sId) != t.charAt(tId)
                || (s.charAt(sId) == 'L' && sId < tId)
                || (s.charAt(sId) == 'R' && sId > tId)) {
                return false;
            }

            sId++;
            tId++;
            
        }
        return true; 
    }
}