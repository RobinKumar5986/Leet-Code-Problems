class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int dom = 0;
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
            if(max < map.get(ele)){
                dom = ele;
                max = map.get(ele);
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