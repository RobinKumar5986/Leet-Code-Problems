class Solution {
    public int minimumIndex(List<Integer> nums) {
        int dom = nums.get(0);
        int count = 1;
        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i) == dom){
                count++;   
            }else{
                count--;
                if(count == 0){
                    dom = nums.get(i);
                    count++;    
                }
            }
        }
        int ind = 0;
        int co = 0;
        for(int ele : nums){
            if(ele == dom)
                co++;
            else
                co--;
            if(co > 0)
                break;
            ind++;
        }
        //validating the right side if its ok
        co = 0;
        for(int  i = ind+1 ; i < nums.size() ; i++){
            if(nums.get(i) == dom)
                co++;
            else
                co--;
        }
        if(co <= 0)
            return -1;
        return ind;
    }
}