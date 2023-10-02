class Solution {
    public String restoreString(String s, int[] ind) {
        char[] c=new char[ind.length];
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<ind.length;i++){
            c[ ind[i] ]=s.charAt(i);
        }
        sb.append(c);
        return sb+"";
    }
}