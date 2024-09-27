import java.util.HashMap;
import java.util.TreeSet;

class NumberContainers {
    HashMap<Integer, Integer> indMap = new HashMap<>();
    HashMap<Integer, TreeSet<Integer>> numMap = new HashMap<>();

    public NumberContainers() {
    }

    public void change(int index, int number) {
        // If the index already has a number, remove the index from its current number's TreeSet
        if (indMap.containsKey(index)) {
            int oldNumber = indMap.get(index);
            TreeSet<Integer> oldSet = numMap.get(oldNumber);
            oldSet.remove(index);
            if (oldSet.isEmpty()) {
                numMap.remove(oldNumber);  // Clean up empty sets
            }
        }

        // Update the index with the new number
        indMap.put(index, number);

        // Add the index to the new number's TreeSet
        numMap.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        // Return the smallest index for the number, or -1 if none exists
        return numMap.containsKey(number) ? numMap.get(number).first() : -1;
    }
}
