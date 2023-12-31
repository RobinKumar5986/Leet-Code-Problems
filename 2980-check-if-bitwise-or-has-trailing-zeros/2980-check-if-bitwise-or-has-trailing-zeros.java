class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count=0;
        for(int n : nums){
            int bit=n & 1;
            if(bit==0)count++;
            if(count==2) return true;
        }
        return false;
    }
}