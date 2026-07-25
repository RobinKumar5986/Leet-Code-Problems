class Solution {
    public int maxProduct(int n) {
        int n1 = -1;
        int n2 = -1;
        while(n > 0) {
            int v = n % 10;
            boolean flg = false;
            if( v > n1) {
                if(n2 < n1){
                    n2 = n1;
                }
                n1 = v;
                flg = true;
            }
            if( !flg && v > n2){
                if(n1 < n2){ n1 = n2; }
                n2 = v;
            }
            n = n/10;
        }
        return n1 * n2;
    }
}