class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==0 || right==0) return 0;
        int c=0;
        while(left!=right){
            left=left>>1;
            right=right>>1;
            c++;
        }
        left=left<<c;
        return left;
    }
}