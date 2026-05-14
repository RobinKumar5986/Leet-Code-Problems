class Solution {
    public boolean isGood(int[] nums) {
        int[] co = new int[201];
        for(int ele : nums){
            co[ele]++;
        }
        for(int i = 1 ; i < nums.length-1; i++){
            if(co[i] != 1){
                return false;
            }
        }

        if(co[nums.length-1] != 2){
            return false;
        }

        return true;
    }
}