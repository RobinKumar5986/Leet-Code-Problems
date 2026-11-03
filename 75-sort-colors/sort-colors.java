class Solution {
    public void sortColors(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        int[] co = new int[3];
        for(int ele : nums){
            co[ele]++;
        }
        int ind = 0;
        for(int i = 0; i < co[0] ; i++){
            nums[ind++] = 0;
        }
        for(int i = 0; i < co[1] ; i++){
            nums[ind++] = 1;
        }
        for(int i = 0; i < co[2] ; i++){
            nums[ind++] = 2;
        }
    }
}