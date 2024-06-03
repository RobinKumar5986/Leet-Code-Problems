class Solution {
    public int appendCharacters(String s, String t) {
        int a=0;
        int b=0;
        while(a<s.length() && b<t.length()){
            if(s.charAt(a)==t.charAt(b)){
                a++;
                b++;
            }else{
                a++;
            }
        }
        return t.length()-b;
    }
}