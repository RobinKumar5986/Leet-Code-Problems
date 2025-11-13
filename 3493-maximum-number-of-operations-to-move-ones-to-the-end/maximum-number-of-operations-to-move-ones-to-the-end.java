class Solution {
    public int maxOperations(String s) {
        int zPhase = 0;
        int i = s.length() - 1;
        int ans = 0;
        while(i >= 0){
            char c = s.charAt(i);
            if(c == '0'){
                zPhase++;
                while( i >= 0 && s.charAt(i) == '0'){
                    i--;
                }
            }else{
                ans += zPhase;
                i--;
            }
        }
        return ans;
    }
}