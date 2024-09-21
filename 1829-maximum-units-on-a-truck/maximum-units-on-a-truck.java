class Solution {
    public int maximumUnits(int[][] boxT, int ts) {
        SortedSet<Integer> set = new TreeSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int ind = 0;

        for (int[] ele : boxT) {
            int key = Integer.MAX_VALUE - ele[1]; 
            if (!map.containsKey(ele[1])) {
                map.put(ele[1], 0);
            }
            map.put(ele[1] ,map.get(ele[1]) + ele[0]);
            set.add(key);
        }
        int ans = 0;
        for (int e : set) {
            int ele = Integer.MAX_VALUE - e;
            int box = map.get(ele);
            if (ts >= box) {
                ts -= box;
                ans += (box * ele);
                if (ts == 0)
                    return ans;
            } else {
                ans += (ele * ts);
                return ans;
            }
        }
        return ans;
    }
}