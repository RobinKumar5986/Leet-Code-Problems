class Solution {
    public boolean isValid(String w) {
        if(w.length() < 3)
            return false;
        boolean isVol = false;
        boolean isConst = false;
        for(char c : w.toCharArray()){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                    isVol = true;
                }else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                    isConst = true;
                }
                continue;
            }
            return false;
        }
        if(isVol && isConst) return true;
        return false;
    }
}