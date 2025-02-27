class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> set = new HashSet<>(); // For lookup
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int prev = arr[i], cur = arr[j];
                int co = 2;
                while (set.contains(prev + cur)) {
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