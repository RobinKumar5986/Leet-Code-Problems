class Solution {
    public void sortColors(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && i!=lo){
               nums[i]=nums[lo];
               nums[lo]=0;
               lo++;
               i--;
            }
            
            else if(i==hi || lo >= hi) break;

            else if(nums[i]==2){
                nums[i]=nums[hi];
                nums[hi]=2;
                hi--;
                i--;
            }
        }
    }
}