class Solution {
    public boolean check(int[] nums) {
        int min = Integer.MAX_VALUE;
        int st = -1;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] <= min){
                min = nums[i];
                st = i;
                while(i+1< nums.length && nums[i] == nums[i+1]){
                    i++;
                }
            }
        }
        int len = nums.length-1;
        while(len != 0){
            int next = nums[(st+1) % nums.length];
            if(nums[st] > next)
                return false;
            st++;
            if(st == nums.length)
                st = 0;
            len--;
        }
        return true;
    }
}