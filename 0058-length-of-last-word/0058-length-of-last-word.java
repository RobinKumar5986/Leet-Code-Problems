class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        int flag=0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ')
                flag=1;
            if(flag==1 && s.charAt(i)==' ') break;

            if(flag==1)
                len++;
        }
        return len;

    }
}