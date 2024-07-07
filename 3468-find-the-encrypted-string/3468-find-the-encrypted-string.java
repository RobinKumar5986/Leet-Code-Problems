class Solution {
    public String getEncryptedString(String s, int k) {
        k=k%s.length();
        StringBuilder sb=new StringBuilder();
        int ind=k;
        for(int i=0;i<s.length();i++){
            if(ind>=s.length())
                ind=0;
            sb.append(s.charAt(ind));
            ind++;
        }
        return sb.toString();
    }
}