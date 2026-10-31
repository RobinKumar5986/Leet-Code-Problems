class NumArray {
    int[] pfSum;
    public NumArray(int[] nums) {
        pfSum = new int[nums.length+1];
        for(int i = 1; i < pfSum.length; i++){
            pfSum[i] = nums[i-1] + pfSum[i-1];
        }
        for(int ele : pfSum){
            System.out.print(ele + " ");
        }
        // System.out.println();
        // System.out.println("--------------------------");
    }
    
    public int sumRange(int left, int right) {
        int l = pfSum[left];
        int r = pfSum[right+1];

        // System.out.println( left + " : " + right +" : " + l + " <-> " + r );
        return r - l;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */