class Solution {
    public int countDays(int days, int[][] meetings) {
        // Sort the meetings by their start day
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Merge the intervals
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = meetings[0];
        
        for (int i = 1; i < meetings.length; i++) {
            if (meetings[i][0] <= currentInterval[1]) {
                // If intervals overlap, merge them
                currentInterval[1] = Math.max(currentInterval[1], meetings[i][1]);
            } else {
                // Add the current interval to the list and move to the next one
                mergedIntervals.add(currentInterval);
                currentInterval = meetings[i];
            }
        }
        // Add the last interval
        mergedIntervals.add(currentInterval);
        
        // Calculate the days without meetings
        int noMeetingDays = 0;
        int previousEnd = 0;
        
        for (int[] interval : mergedIntervals) {
            if (interval[0] > previousEnd + 1) {
                noMeetingDays += interval[0] - previousEnd - 1;
            }
            previousEnd = interval[1];
        }
        
        // Account for the days after the last meeting
        if (previousEnd < days) {
            noMeetingDays += days - previousEnd;
        }
        
        return noMeetingDays;
    }
}
