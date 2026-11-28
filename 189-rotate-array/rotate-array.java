class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int ind = (nums.length - k + i) % nums.length;
            temp[i] = nums[ind];
        }
        for(int i = 0 ; i < nums.length; i++){
            nums[i] = temp[i];
        }
    }
}