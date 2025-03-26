class Solution {
    public String mergeAlternately(String w1, String w2) {
        int len = w1.length();
        len = Math.min(len,w2.length());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <len; i++){
            sb.append(w1.charAt(i));
            sb.append(w2.charAt(i));
        }
        while(len < w1.length()){
            sb.append(w1.charAt(len));
            len++;
        }
        while(len < w2.length()){
            sb.append(w2.charAt(len));
            len++;
        }
        return sb.toString();
    }
}