class Solution {
    public boolean buddyStrings(String s, String g) {
        if(s.length()!=g.length() || s.length()<=1 ) return false;

        if(s.equals(g)){
            HashSet<Character> unique=new HashSet();

            for(char c : s.toCharArray()){
                unique.add(c);
            }
            if(unique.size()<s.length()) return true;
            else return false;

        }


        int c=0;
        char map1[]=new char[2];
        char map2[]=new char[2];
        

        for(int i=0;i<s.length() ;i++){

            if(s.charAt(i)!=g.charAt(i)){

                c++;
                if(c==1){ 
                    map1[0]=s.charAt(i);
                    map2[0]=g.charAt(i);
                }
                 if(c==2){ 
                    map1[1]=s.charAt(i);
                    map2[1]=g.charAt(i);
                }
                if(c>2) return false;
            }
        }
        if(c==2 &&
        map1[0]==map2[1] && map1[1]== map2[0]){
            return true;
        }
        return false;
        

    }
}