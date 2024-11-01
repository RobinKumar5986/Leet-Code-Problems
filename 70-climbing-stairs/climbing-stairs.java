class Solution {
    public int climbStairs(int n) {
        int one = 1;
        int two = 1;
        for(int i = n-2 ; i >= 0 ; i--){
            int temp = one;
            one += two;
            two = temp;
        }
        return one;
    }
}