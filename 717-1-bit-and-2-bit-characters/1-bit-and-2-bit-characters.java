class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits[bits.length-1] == 1)
            return false;
        if(bits.length == 1)
            return true;
        int ind = 0;
        boolean isOneBit = true;
        while(ind < bits.length){
            if(bits[ind] == 1){
                isOneBit = false;
                ind++;
            }else{
                isOneBit = true;
            }
            ind++;
        }
        return isOneBit;
    }
}