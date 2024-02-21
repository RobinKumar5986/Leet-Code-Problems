class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int n=0;
        int t=x;
        while(t!=0){
            n=n*10 + t%10;
            t=t/10; 
        }
        return n==x;
    }
}