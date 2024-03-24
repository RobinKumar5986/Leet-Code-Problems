class Solution {
    public int findDuplicate(int[] nums) {
        int fast=0;
        int slow=0;
        while(true){
            fast=nums[nums[fast]];
            slow=nums[slow];
            if(fast==slow)
                break;
        }
        int slow2=0;
        while(true){
            slow=nums[slow];
            slow2=nums[slow2];
            if(slow==slow2)
                break;
        }
        return slow;
    }
}