class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> bucket[]=new ArrayList[nums.length+1];
        int[] ans=new int[k];
        for(int ele:nums)
            map.put(ele,map.getOrDefault(ele,0)+1);

        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            int key=ele.getKey();
            int val=ele.getValue();
            if(bucket[val]==null)
                bucket[val]=new ArrayList<>();
            bucket[val].add(key);
        }
        int ind=0;
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(int ele : bucket[i]){
                    ans[ind++]=ele;
                    k--;
                    if(k==0)
                        return ans;
                }
            }
        }
        return new int[0];
    }
}