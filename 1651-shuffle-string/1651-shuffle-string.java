class Solution {
    public String restoreString(String s, int[] ind) {
        char[] c=new char[ind.length];
        for(int i=0;i<ind.length;i++){
            c[ ind[i] ]=s.charAt(i);
        }
        s="";
        for(int i=0;i<ind.length;i++){
            s+=c[i];
        }
        return s;
    }
}