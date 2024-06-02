class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = meetings[0];
        
        for (int i = 1; i < meetings.length; i++) {
            if (meetings[i][0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], meetings[i][1]);
            } else {
                mergedIntervals.add(currentInterval);
                currentInterval = meetings[i];
            }
        }

        mergedIntervals.add(currentInterval);
        
        int noMeetingDays = 0;
        int previousEnd = 0;
        
        for (int[] interval : mergedIntervals) {
            if (interval[0] > previousEnd + 1) {
                noMeetingDays += interval[0] - previousEnd - 1;
            }
            previousEnd = interval[1];
        }
        
        if (previousEnd < days) {
            noMeetingDays += days - previousEnd;
        }        
        return noMeetingDays;
    }
}