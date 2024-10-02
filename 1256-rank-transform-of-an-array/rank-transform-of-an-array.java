import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];
        
        // Step 1: Create an array of indices to avoid cloning
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        // Step 2: Sort indices based on the values in the original array
        Arrays.sort(indices, (a, b) -> Integer.compare(arr[a], arr[b]));
        
        // Step 3: Rank assignment
        int[] result = new int[n];
        int rank = 1;
        
        // Traverse the sorted indices and assign ranks
        result[indices[0]] = rank;
        for (int i = 1; i < n; i++) {
            // Only increase the rank if current element is different from the previous one
            if (arr[indices[i]] != arr[indices[i - 1]]) {
                rank++;
            }
            result[indices[i]] = rank;
        }
        
        return result;
    }
}
