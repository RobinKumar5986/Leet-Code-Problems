import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] queriesWithIndex = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            queriesWithIndex[i][0] = queries[i];
            queriesWithIndex[i][1] = i; 
        }

        Arrays.sort(queriesWithIndex, Comparator.comparingInt(a -> a[0]));

        int[] mB = new int[queries.length];
        int ind = 0;
        int maxBeauty = 0;

        for (int i = 0; i < queriesWithIndex.length; i++) {
            int queryValue = queriesWithIndex[i][0];
            int originalIndex = queriesWithIndex[i][1];

            while (ind < items.length && items[ind][0] <= queryValue) {
                maxBeauty = Math.max(items[ind][1], maxBeauty);
                ind++;
            }
            mB[originalIndex] = maxBeauty;
        }

        return mB;
    }
}
