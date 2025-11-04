class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int lo = 0;
        int hi = k-1;
        int[] ans = new int[nums.length -(k - 1)];
        int ansInd = 0;
        while(hi < nums.length){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = lo ; i <= hi ; i++){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
            //max heap
            PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((a,b) -> {
                int key1 = a.getKey();
                int key2 = b.getKey();
                int val1 = a.getValue();
                int val2 = b.getValue();

                if(val1 != val2){
                    return val2 - val1;    
                }else{
                    return key2 - key1;
                }
            });
            for(Map.Entry<Integer,Integer> ele : map.entrySet()){
                q.offer(ele);
            }
            int sum = 0;
            int temp = x;
            while(!q.isEmpty()){
                Map.Entry<Integer,Integer> e = q.poll();
                sum += e.getKey() * e.getValue();
                temp--;
                if(temp == 0)
                    break;
            }
            ans[ansInd++] = sum;
            lo++;
            hi++;
        }  
        return ans; 
    }
}