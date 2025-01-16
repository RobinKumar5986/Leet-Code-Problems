class Solution {
    public int xorAllNums(int[] n1, int[] n2) {
        if(n1.length%2 == 0 && n2.length%2 == 0)
            return 0;
        int xor = 0;
        for(int ele : n2)
            xor = xor ^ ele;
        if(n2.length % 2 == 0)
            return xor;
        int ans = 0 ;
        for(int ele : n1){
            ans = ans ^ xor ^ ele;
        }
        return ans;
    }
}