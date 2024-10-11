class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
    
        int[][] events = new int[n][3];
        
        for (int i = 0; i < n; i++) {
            events[i][0] = times[i][0]; // arrival time
            events[i][1] = times[i][1]; // leaving time
            events[i][2] = i; // index of the person
        }
        
        // Sort events by arrival time
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Min-heap to track the smallest available chair
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        // Min-heap to track when people leave (by leaving time)
        PriorityQueue<int[]> occupiedChairs = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        
        // Initially, all chairs are available
        for (int i = 0; i < n; i++) {
            availableChairs.add(i);
        }
        
        // Go through each event (sorted by arrival time)
        for (int i = 0; i < n; i++) {
            int arrival = events[i][0];
            int departure = events[i][1];
            int personIndex = events[i][2];
            
            // Free up chairs for people who have already left
            while (!occupiedChairs.isEmpty() && occupiedChairs.peek()[0] <= arrival) {
                availableChairs.add(occupiedChairs.poll()[1]);
            }
            
            // Assign the smallest available chair to the current person
            int assignedChair = availableChairs.poll();
            
            // If this is the person we are interested in (targetFriend), return the chair number
            if (personIndex == targetFriend) {
                return assignedChair;
            }
            
            // Add this person to the occupiedChairs heap with their departure time
            occupiedChairs.add(new int[]{departure, assignedChair});
        }
        
        return -1; // This should never be reached if input is valid
    }
}
