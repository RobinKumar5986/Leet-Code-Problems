class Solution {
    public int maxChunksToSorted(int[] arr) {
        int s1 = 0;
        int s2 = 0;
        int ans = 0;
        int[] sort = Arrays.copyOf(arr,arr.length);
        Arrays.sort(sort);
        for(int i = 0; i<arr.length;i++){
            s1 += arr[i];
            s2 += sort[i];
            if(s1 == s2){
                ans++;
                s1 = 0;
                s2 = 0;
            }
        }
        return ans;
    }
}