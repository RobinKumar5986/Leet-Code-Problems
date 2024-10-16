import java.util.PriorityQueue;

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        // Using a priority queue to store the counts of characters
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x, y) -> Integer.compare(y[0], x[0]));
        if (a > 0) maxHeap.offer(new int[] {a, 'a'});
        if (b > 0) maxHeap.offer(new int[] {b, 'b'});
        if (c > 0) maxHeap.offer(new int[] {c, 'c'});

        StringBuilder sb = new StringBuilder();

        // Build the longest diverse string
        while (!maxHeap.isEmpty()) {
            // Get the most frequent character
            int[] first = maxHeap.poll();
            if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == first[1] && sb.charAt(sb.length() - 2) == first[1]) {
                // If the last two characters are the same as the most frequent, we need to pick the next one
                if (maxHeap.isEmpty()) break; // No more characters to choose from

                int[] second = maxHeap.poll();
                sb.append((char) second[1]); // Append the second character
                if (--second[0] > 0) maxHeap.offer(second); // Decrease its count and add it back if it's still > 0
                maxHeap.offer(first); // Reinsert the first character back to the heap
            } else {
                // Append the most frequent character
                sb.append((char) first[1]);
                if (--first[0] > 0) maxHeap.offer(first); // Decrease its count and add it back if it's still > 0
            }
        }

        return sb.toString();
    }
}
