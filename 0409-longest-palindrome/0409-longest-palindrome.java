class Solution {
    public int longestPalindrome(String s) {
        int[] map=new int[58];
        for(int i=0;i<s.length();i++)
            map[s.charAt(i) - 'A']++;
        boolean flag=true;
        int ans=0;
        for(int ele : map){
            if(flag && ele%2!=0){
                ans+=ele;
                flag=false;
            }
            else if(ele>=2){
                ele=ele/2;
                ans+=ele*2;
            }
        }
        return ans;
    }
}