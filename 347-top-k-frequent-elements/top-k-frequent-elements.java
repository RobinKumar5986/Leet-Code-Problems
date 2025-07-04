class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            int[] arr = new int[2];
            arr[0] = ele.getKey();
            arr[1] = ele.getValue();
            pq.add(arr);
        }
        int[] ans = new int[k];
        int i = 0;
        while(k > 0){
            ans[i++] = pq.remove()[0];
            k--;
        }

        return ans;
    }
}