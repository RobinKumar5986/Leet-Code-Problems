class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int ele : nums){
            if(ele > max)
                max = ele;
        }
        int ans = 0;
        int count = 0;
        for(int ele : nums){ 
            if(ele == max){
                count++;
            }else{
                if(count > ans){
                    ans = count;
                }
                count = 0;
            }
        }
        if(count > ans){
            ans = count;
        }
        return ans;
    }
}