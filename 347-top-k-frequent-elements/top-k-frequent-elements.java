class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int[] ans = new int[k];
        for(int ele : nums) {
            map.put(ele, map.getOrDefault(ele,0) + 1);
        }
        Queue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            pq.offer(ele);
            if(pq.size() > k)
                pq.poll();
        }
        for(int i = 0 ; i < k; i++){
            Map.Entry<Integer,Integer> pair = pq.poll();
            ans[i] = pair.getKey();
        }
        return ans;
    }
}