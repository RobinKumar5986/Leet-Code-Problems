class Solution {
    public boolean hasSameDigits(String s) {
        while(true){
            if(s.length() == 2){
                return s.charAt(0) == s.charAt(1);
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i < s.length(); i++){
                int prev = s.charAt(i-1) - '0';
                int cur = s.charAt(i) - '0';
                sb.append((prev+cur)%10);
            }
            s = sb.toString();
        }
    }
}