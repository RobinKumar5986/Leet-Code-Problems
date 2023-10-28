class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=0) return 0;
        Arrays.sort(nums);
        int c=1;
        int max=1;
        for(int i : nums){
            System.out.print(i+"  ");
        }System.out.println();

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
                System.out.print(nums[i] + " count : "+c);
                c++;
            }else if(nums[i]==nums[i+1]){
                System.out.print("continue" + c);
                continue;
            }
            else{
                if(max<c)max=c;
                c=1;
            }
            System.out.println();

        }
        if(max<c) max=c;

        return max;
    }
}