class Solution {
    public int[] sortedSquares(int[] nums) {
    //     int square[]=new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         square[i]=nums[i]*nums[i];
    //     }
    //     Arrays.sort(square);
    //     return square;
    // }

    //----two pointer Solution-----//
        int lo=0;
        int hi=nums.length-1;
        int result[]=new int[nums.length];
        int ind=nums.length-1;

        int num1=nums[lo]*nums[lo];
        int num2=nums[hi]*nums[hi];

        while(lo<=hi){
           if(num1<=num2)
           {
               result[ind]=num2;
               hi--;
               if(hi>=0)
                num2=nums[hi]*nums[hi];

           }else{
               result[ind]=num1;
               if(lo<=nums.length-1)
                    lo++;
               num1=nums[lo]*nums[lo];
           }
           ind--;
           
        }
        return result;
    }
}