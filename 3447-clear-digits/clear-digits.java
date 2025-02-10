class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= '0' && c <= '9'){
                sb.deleteCharAt(sb.length() -1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}