class MyCalendarTwo {
    TreeMap<Integer, Integer> map = new TreeMap<>();

    public MyCalendarTwo() {
    }

    public boolean book(int start, int end) {
        int sum = 0;

        // Tentatively modify the map for the new event
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) - 1);

        // Check if this booking causes triple booking
        for (int count : map.values()) {
            sum += count;
            if (sum >= 3) {
                // Rollback if the booking causes triple overlap
                map.put(start, map.get(start) - 1); // Rollback start increment
                if (map.get(start) == 0) {
                    map.remove(start); // Remove the entry if it's zero
                }

                map.put(end, map.get(end) + 1); // Rollback end decrement
                if (map.get(end) == 0) {
                    map.remove(end); // Remove the entry if it's zero
                }

                return false;
            }
        }
        return true;
    }
}
