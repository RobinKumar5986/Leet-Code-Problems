class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.startsWith(needle))return 0;
        return haystack.indexOf(needle);
    }
}