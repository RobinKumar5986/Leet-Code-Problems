import java.util.*;

class Solution {
    public long findScore(int[] nums) {
        long ans = 0;

        // Create an array of indices
        int n = nums.length;
        int[][] indexedNums = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexedNums[i][0] = nums[i];
            indexedNums[i][1] = i;
        }

        // Sort by value first, then by index
        Arrays.sort(indexedNums, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        // Use a boolean array to track visited indices
        boolean[] visited = new boolean[n];

        // Process the sorted array
        for (int[] pair : indexedNums) {
            int value = pair[0];
            int index = pair[1];

            // If the index is not visited, process it
            if (!visited[index]) {
                ans += value;
                visited[index] = true;
                if (index - 1 >= 0) visited[index - 1] = true;
                if (index + 1 < n) visited[index + 1] = true;
            }
        }

        return ans;
    }
}
