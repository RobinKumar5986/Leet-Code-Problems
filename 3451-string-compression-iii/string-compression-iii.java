class Solution {
    public String compressedString(String s) {
        int co = 1;
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        for(int i = 1 ; i < s.length() ; i++){
            if( co > 9 ){
                co = 1;
                sb.append("9" + c );
            }
            if( c == s.charAt(i)){
                co++;
            }
            else{
                sb.append(co + "" + c);
                c = s.charAt(i);
                co = 1;
            }
        }
        while(co > 9){
            sb.append("9" + c);
            co -= 9;
        }
        if(co > 0){
            sb.append(co + "" + c);
        }
        return sb.toString();
    }
}