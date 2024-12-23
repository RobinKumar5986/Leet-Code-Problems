class Solution {
    int ans = 0;

    void bfs(Queue<TreeNode> q) {
        if (q.isEmpty()) {
            return;
        }

        List<Integer> org = new ArrayList<>();
        List<Integer> sort = new ArrayList<>();

        int len = q.size();
        while (len > 0) {
            TreeNode node = q.poll();
            org.add(node.val);
            sort.add(node.val);
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
            len--;
        }

        // Sort the `sort` list to get the target order
        Collections.sort(sort);

        // Calculate the minimum swaps to sort `org`
        ans += calculateMinSwaps(org, sort);

        // Continue BFS for the next level
        bfs(q);
    }

    int calculateMinSwaps(List<Integer> org, List<Integer> sort) {
        int n = org.size();
        boolean[] visited = new boolean[n];
        int swaps = 0;

        // Create a mapping of value -> index in the sorted array
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            valueToIndex.put(sort.get(i), i);
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] || org.get(i).equals(sort.get(i))) {
                continue; // Skip if already visited or in the correct position
            }

            // Find the cycle size
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = valueToIndex.get(org.get(j));
                cycleSize++;
            }

            // Add (cycleSize - 1) to swaps
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        bfs(q);
        return ans;
    }
}
