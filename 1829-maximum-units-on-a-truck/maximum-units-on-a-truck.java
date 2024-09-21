import java.util.PriorityQueue;

class Solution {
    public int maximumUnits(int[][] boxT, int ts) {
        // Use a max-heap (priority queue) to store the number of units per box type
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        // Fill the max-heap with the number of boxes and their units
        for (int[] ele : boxT) {
            maxHeap.offer(new int[]{ele[0], ele[1]});
        }

        int ans = 0;

        // While there are still boxes in the heap and we have time slots left
        while (!maxHeap.isEmpty() && ts > 0) {
            int[] current = maxHeap.poll(); // Get the box with the most units
            int boxCount = current[0];
            int units = current[1];

            // If we can take all boxes of this type
            if (ts >= boxCount) {
                ans += boxCount * units;
                ts -= boxCount; // Decrease the remaining time slots
            } else {
                // If we can't take all, take as many as we can
                ans += ts * units;
                ts = 0; // All time slots are used up
            }
        }

        return ans;
    }
}
