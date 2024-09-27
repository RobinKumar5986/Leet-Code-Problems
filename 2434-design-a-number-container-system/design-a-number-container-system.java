import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.HashSet;

class NumberContainers {
    HashMap<Integer, Integer> indMap = new HashMap<>();  // Map index to number
    HashMap<Integer, PriorityQueue<Integer>> numMap = new HashMap<>();  // Map number to min-heap of indices
    HashMap<Integer, HashSet<Integer>> validIndices = new HashMap<>();  // Track valid indices for numbers

    public NumberContainers() {
    }

    public void change(int index, int number) {
        // If the index already has a number, remove it from the old number's heap
        if (indMap.containsKey(index)) {
            int oldNumber = indMap.get(index);
            if (numMap.containsKey(oldNumber)) {
                // Mark the old index as invalid for the old number
                validIndices.get(oldNumber).remove(index);
            }
        }

        // Update the index with the new number
        indMap.put(index, number);

        // Add the index to the heap for the new number
        numMap.computeIfAbsent(number, k -> new PriorityQueue<>()).add(index);
        validIndices.computeIfAbsent(number, k -> new HashSet<>()).add(index);
    }

    public int find(int number) {
        // If the number is not present, return -1
        if (!numMap.containsKey(number) || numMap.get(number).isEmpty()) {
            return -1;
        }

        // Clean up the heap (remove invalid indices that have been changed)
        PriorityQueue<Integer> heap = numMap.get(number);
        while (!heap.isEmpty() && !validIndices.get(number).contains(heap.peek())) {
            heap.poll();  // Remove invalid indices from the heap
        }

        // If the heap is empty after cleanup, return -1
        if (heap.isEmpty()) {
            return -1;
        }

        // Return the smallest valid index for this number
        return heap.peek();
    }
}
