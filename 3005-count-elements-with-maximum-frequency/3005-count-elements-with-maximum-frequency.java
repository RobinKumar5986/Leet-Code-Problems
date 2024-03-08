class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0) +1);
            if(map.get(ele)>max)
                max=map.get(ele);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            if(ele.getValue() == max)
                ans+=ele.getValue();
        }
        return ans;
    }
}