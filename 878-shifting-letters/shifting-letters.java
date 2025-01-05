class Solution {
    public String shiftingLetters(String s, int[] sh) {
        StringBuilder sb = new StringBuilder();
        for(int i = sh.length-1; i>=0 ; i--){
            if(i == sh.length - 1){
                sh[i] = sh[i] % 26;
            }else{
                sh[i] = (sh[i+1] + sh[i]) % 26;
            }
        }
        for(int i = 0 ; i < sh.length ; i++){
            int c = s.charAt(i) - 'a';
            c = (c + sh[i])%26;
            c = c+ + 'a';
            sb.append((char)c);
        }
        return sb.toString();
    }
}