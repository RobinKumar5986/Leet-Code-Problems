class Solution {
    boolean check(int ind,String s , String g){
        for(int i = 0; i<s.length() ;i++){
            if(ind == g.length())
                ind = 0;
            if(s.charAt(i) != g.charAt(ind))
                return false;
            ind++;
        }
        return true;
    }
    public boolean rotateString(String s, String g) {
        if(s.length() != g.length())
            return false;
        List<Integer> inds = new ArrayList<>();
        for(int i = 0 ; i<g.length() ; i++ ){
            if( s.charAt(0) == g.charAt(i)){
                inds.add(i);
            }
        }
        for(int ele : inds){
            if(check(ele,s,g))
                return true;
        }
        return false;
    }
}