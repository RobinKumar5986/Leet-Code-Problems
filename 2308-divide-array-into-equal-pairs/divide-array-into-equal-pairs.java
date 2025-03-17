class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 != 0) return false;
        int[] map = new int[501];
        for(int ele : nums)
            map[ele]++;
        for(int ele : map){
            if(ele % 2 != 0)
                return false;
        }
        return true;
    }
}