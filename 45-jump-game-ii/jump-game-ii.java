class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1 ) return 0;
        int max = 0;
        int jump = 0;
        int prev = 0; 
        for(int i = 0; i < nums.length-1; i++){
            max = Math.max(i+nums[i],max);
            if(i == prev){
                jump++;
                prev = max;
            }
            
        }
        return jump;
    }
}