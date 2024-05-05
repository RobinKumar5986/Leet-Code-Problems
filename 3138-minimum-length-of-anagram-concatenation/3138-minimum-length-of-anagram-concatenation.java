class Solution {
    boolean isAnagram(String s,int l){
        int[] base=new int[26];
        for(int i=0;i<l;i++)
            base[s.charAt(i) -'a']++;

        for(int i=0;i<=s.length();i+=l){
            if(i+l<=s.length()){
                int[] map=new int[26];
                for(int j=i;j<i+l;j++){
                    char c=s.charAt(j);
                    if(base[c-'a']==0)
                        return false;
                    map[c-'a']++;
                }
                for(int x=0;x<26;x++){
                    if(base[x]!=map[x])
                        return false;
                }
            }
        }
        return true;
    }
    public int minAnagramLength(String s) {
        for(int i=1;i<=s.length();i++){
            if(s.length()%i==0 && isAnagram(s,i)){
                return i;
            }
        }
        return s.length();
    }
}