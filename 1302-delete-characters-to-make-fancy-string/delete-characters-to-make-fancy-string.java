class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(sb.length() < 2){
                sb.append(c);
                continue;
            }
            int len = sb.length();
            if(sb.charAt(len - 1) != c || sb.charAt(len - 2) != c){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}