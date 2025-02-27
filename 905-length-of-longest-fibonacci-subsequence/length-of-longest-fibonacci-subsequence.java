class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>(); // For lookup
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int prev = arr[i], cur = arr[j];
                int co = 2;
                while (map.containsKey(prev + cur)) {
                    int key = prev + cur;
                    prev = cur;
                    cur = key;
                    co++;
                    ans = Math.max(ans, co);
                }
            }
        }
        return ans >= 3 ? ans : 0; 
    }
}