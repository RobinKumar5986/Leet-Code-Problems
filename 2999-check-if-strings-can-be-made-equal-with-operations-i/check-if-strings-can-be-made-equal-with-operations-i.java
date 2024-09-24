class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        String ans = s1.charAt(2) + "" + s1.charAt(1) + "" + s1.charAt(0) + "" + s1.charAt(3);
        if(ans.equals(s2))
            return true;
        ans = "";
        ans = s1.charAt(0) + "" + s1.charAt(3) + "" + s1.charAt(2) + "" + s1.charAt(1);
        if(ans.equals(s2))
            return true;
        ans = "";
        ans = s1.charAt(2) + "" + s1.charAt(3) + "" + s1.charAt(0) + "" + s1.charAt(1);
        if(ans.equals(s2))
            return true;
        return false;
    }
}