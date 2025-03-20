class Solution {
    public int minSetSize(int[] arr) {
        int rSz = arr.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr)
            map.put(ele , map.getOrDefault(ele,0) +1);

        //max heap
        Queue<int[]> pQ = new PriorityQueue<>((x,y) -> Integer.compare(y[1],x[1]));

        for(Map.Entry<Integer, Integer> ele : map.entrySet()){
            int[] pEle = new int[2];
            pEle[0] = ele.getKey();
            pEle[1] = ele.getValue();
            pQ.add(pEle);
        }
        int ans = 0;
        while (rSz > 0) {
            rSz -= pQ.poll()[1];
            ans++;
        }
        return ans;
    }
}