class Solution {
    public int longestPalindrome(String s) {
        int[] map=new int[58];
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map[c - 'A']++;
            if(map[c-'A']%2==0)
                ans+=2;
        }
        for(int ele : map){
            if(ele%2!=0){
                ans+=1;
                break;
            }
        }
        return ans;
    }
}