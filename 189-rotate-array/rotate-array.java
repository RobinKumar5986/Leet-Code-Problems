class Solution {
    public void rotate(int[] nums, int k) {
        while(k>nums.length){
            k=k-nums.length;
        }
        int[] ans = new int[nums.length];
        int ind = nums.length - k;
        for(int i = 0; i < nums.length; i++) {
            ind = ind % nums.length;
            ans[i] = nums[ind];
            ind++;
        }
        for(int i = 0 ; i < nums.length; i++){
            nums[i] = ans[i];
        }
    }
}