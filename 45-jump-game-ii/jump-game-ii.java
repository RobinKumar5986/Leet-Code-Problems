class Solution {
    public int jump(int[] nums) {
        if(nums.length <= 1)
            return 0;

        int indEnd = nums[0];
        int jump = 1;

        for(int i = 0 ; i < nums.length;){
            if(nums[i] + i >= nums.length-1)
                return jump;
            int nextFar = indEnd;
            for(int j = i+1 ; j <= indEnd; j++,i++){
                if(nums[j] + j >= nums.length-1)
                    return jump+1;
                nextFar = Math.max(nextFar,nums[j]+j);
            }
            jump += 1;
            indEnd = nextFar;
        }
        return jump;

    }
}