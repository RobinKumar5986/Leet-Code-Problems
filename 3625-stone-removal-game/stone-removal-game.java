class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10)
            return false;
        boolean isA = true;
        int st = 10;
        while(n >= 0) {
            n -= st;
            isA = !isA;
            st--;
        }
        return isA;
    }
}