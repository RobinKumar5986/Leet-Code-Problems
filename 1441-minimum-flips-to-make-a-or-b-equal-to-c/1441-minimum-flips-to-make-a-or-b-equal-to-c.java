class Solution {
    public int minFlips(int a, int b, int c) {
        int res=a | b;
        int count=0;

        for(int i=0;i<32;i++){
            //gives the ith bit
            int t1=(res >> i) & 1;
            int t2=(c >> i) &1;
            if( t1 != t2){
                int aBit=(a >> i) & 1;
                int bBit=(b >> i) & 1;

                if(aBit==0 && bBit==0){
                    count+=1;
                }else{
                    count+=aBit+bBit;
                }
            }
        }
        return count;
        
    }
}