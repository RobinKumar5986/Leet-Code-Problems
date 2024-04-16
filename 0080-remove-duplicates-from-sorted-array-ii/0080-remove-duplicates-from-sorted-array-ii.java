class Solution {
    public int removeDuplicates(int[] nums) {
        int c=1;
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                if(c>=2)
                    continue;
                c++;
                nums[k]=nums[i];
                k++;
            }else{
                c=1;
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}