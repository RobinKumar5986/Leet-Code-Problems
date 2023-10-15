class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!freq.containsKey(nums[i])) freq.put(nums[i],1);
            else freq.put(nums[i],freq.get(nums[i])+1);
        }
        int ans[]=new int[k];
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(freq.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);
        for(int i=0;i<k;i++){
            Map.Entry<Integer, Integer> entry = list.get(i);
            ans[i]=(int)entry.getKey();
        }
        return ans;
    }
}