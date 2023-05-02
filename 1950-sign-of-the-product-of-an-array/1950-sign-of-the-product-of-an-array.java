class Solution {
    public int arraySign(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }else if(nums[i]<0){
                c++;
            }else{
               break;
            }
        }
        if(c%2==0) return 1;
        return -1;

    }
}