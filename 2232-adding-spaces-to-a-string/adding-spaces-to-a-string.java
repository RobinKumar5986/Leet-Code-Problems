class Solution {
    public String addSpaces(String s, int[] sp) {
        int ind = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            if(ind < sp.length && i == sp[ind] ){
                sb.append(' ');
                ind++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}