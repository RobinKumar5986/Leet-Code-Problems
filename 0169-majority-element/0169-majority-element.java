class Solution {
    public int majorityElement(int[] nums) {
        int ele=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            if(c==0){
                ele=nums[i];
            }
            if(nums[i]==ele){
                c++;
            }else{
                c--;
            }
            
            // if(c>=nums.length/2) return ele;
        }
        return ele;

    }
}