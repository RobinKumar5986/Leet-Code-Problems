class Solution {
    public int findDuplicate(int[] nums) {
//----------Solution with Space Complexity----------//
        // Set<Integer> map=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.contains(nums[i])){
        //         return nums[i];
        //     }else{
        //         map.add(nums[i]);
        //     }
        // }
        // return -1;

//----------Solution using turtle method-------//
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        fast=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }

        return slow;
    }
}