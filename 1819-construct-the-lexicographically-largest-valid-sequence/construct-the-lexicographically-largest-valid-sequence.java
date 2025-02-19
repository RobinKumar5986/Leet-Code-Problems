class Solution {
    int[] res;
    boolean[] used;

    boolean backtrack(int n, int index) {
        if (index == res.length) return true;

        if (res[index] != 0) return backtrack(n, index + 1);

        for (int num = n; num >= 1; num--) {
            if (used[num]) continue;

            int secondIndex = (num == 1) ? -1 : index + num;

            if (secondIndex < res.length && (secondIndex == -1 || res[secondIndex] == 0)) {
                res[index] = num;
                if (secondIndex != -1) res[secondIndex] = num;
                used[num] = true;

                if (backtrack(n, index + 1)) return true;

                res[index] = 0;
                if (secondIndex != -1) res[secondIndex] = 0;
                used[num] = false;
            }
        }
        return false;
    }

    public int[] constructDistancedSequence(int n) {
        int size = 2 * n - 1;
        res = new int[size];
        used = new boolean[n + 1];

        backtrack(n, 0);
        return res;
    }
}
