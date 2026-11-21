class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1)
            return 0;
        int max = nums[0];
        if(max >= nums.length-1)
            return 1;
        int jump = 1;
        for(int i  = 1; i < nums.length; i++){
            int temp = max;
            for(int j = i; j <= max; j++,i++){
                temp = Math.max(temp, j + nums[j] );
                if( temp >= nums.length-1)
                    return jump+1;
            }
            i--;
            max = temp;
            jump++;
        }
        return 0;
    }
}