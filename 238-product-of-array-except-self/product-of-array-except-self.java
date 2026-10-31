class Solution {
    public int[] productExceptSelf(int[] nums) {
        int co = 0;
        int[] pefx = new int[nums.length];
        int[] pofx = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == 0 ){
                co++;
                if(co >= 2) return new int[nums.length]; 
            }
            if(i == 0) {
                pefx[i] = nums[i];
                pofx[nums.length-1-i] = nums[nums.length-1 - i];
            }else{
                pefx[i] = pefx[i-1] * nums[i];
                pofx[nums.length-1-i] = pofx[nums.length -1 -i + 1] * nums[nums.length -1 -i];
            }
            // System.out.println(pefx[i] + " : " + pofx[nums.length-1-i] );
        }
        
        for(int i = 0 ; i < nums.length; i++ ){
            Integer num = null;
            if(i-1 >= 0){
                num = pefx[i-1];
            }
            if(i+1 < nums.length){
                if(num == null){
                    num = pofx[i+1];
                }else{
                    num = num * pofx[i+1];
                }
            }
            nums[i] = num;

        }
        return nums;
    }
}