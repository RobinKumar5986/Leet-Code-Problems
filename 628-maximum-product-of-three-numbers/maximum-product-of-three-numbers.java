class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length-1;
        Arrays.sort(nums);
        //case all positive
        int n1 = nums[len] * nums[len-1] * nums[len-2];
        //two negative 
        int n2 = nums[len] * nums[0] * nums[1];

        return Math.max(n1,n2);
    }
}