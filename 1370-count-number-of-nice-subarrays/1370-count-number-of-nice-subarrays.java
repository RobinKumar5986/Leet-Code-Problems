class Solution {
    public int numberOfSubarrays(int[] nums, int key) {
        int count = 0, result = 0, prefixCount = 0;
        int[] prefixSums = new int[nums.length + 1];

        // Initialize prefix sums array
        prefixSums[0] = 1;

        for (int num : nums) {
            // Count the number of odd numbers
            if (num % 2 != 0) {
                count++;
            }

            // If there are 'key' odd numbers, increase result
            if (count >= key) {
                result += prefixSums[count - key];
            }

            // Update prefix sums
            prefixSums[count]++;
        }

        return result;
    }
}
