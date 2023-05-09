class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[]=new int[nums.length];
        int  mul=1;
        int mul2=1;
        int c=nums.length;
        for(int i=0;i<nums.length;i++){
            mul*=nums[i];
            if(nums[i]!=0){
                mul2*=nums[i];
                c--;
            }   
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                answer[i]=mul/nums[i];
            }else if(c==1){
                answer[i]=mul2;
            }else{
                answer[i]=0;
            }
        }
        System.out.println(c);
        return answer;
    }
}