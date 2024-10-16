class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x, y) -> Integer.compare(y[0], x[0]));
        if (a > 0) maxHeap.offer(new int[] {a, 'a'});
        if (b > 0) maxHeap.offer(new int[] {b, 'b'});
        if (c > 0) maxHeap.offer(new int[] {c, 'c'});

        StringBuilder ans = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            int[] first = maxHeap.poll();
            char cur = (char) first[1];

            if (ans.length() < 2 || ans.charAt(ans.length() - 1) != cur || ans.charAt(ans.length() - 2) != cur) {
                ans.append(cur);
                first[0]--;
                if (first[0] > 0) {
                    maxHeap.offer(first);
                }
            } else {
                if (maxHeap.isEmpty()) break;
                int[] second = maxHeap.poll();
                ans.append((char) second[1]);
                second[0]--;
                if (second[0] > 0) {
                    maxHeap.offer(second);
                }
                maxHeap.offer(first);
            }
        }

        return ans.toString();
    }
}
