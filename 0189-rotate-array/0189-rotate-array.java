class Solution {
    public void rotate(int[] nums, int k) {
        while(k>nums.length){
            k=k-nums.length;
        }
        int[] rotArr=new int[nums.length];
        int indLast=nums.length-k;
        int j=0;
        for(int i=indLast;i<nums.length;i++){
            rotArr[j++]=nums[i];
        }

        for(int i=0;i<indLast;i++){
            rotArr[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=rotArr[i];
        }
    }
}