class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        int lSum = 0;
        for(int i = 0 ; i < nums.length; i++){
            // System.out.println(lSum + " : " + i + " : " + (total -  nums[i]));
            if(lSum == total -  nums[i] - lSum)
                return i;
            lSum += nums[i];
        }
        return -1;
    }
}