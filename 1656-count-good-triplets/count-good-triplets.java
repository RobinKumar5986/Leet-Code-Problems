class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = i +1; j< arr.length ; j++){
                for(int k = j+1; k< arr.length ; k++){
                    int v1 = Math.abs(arr[i] - arr[j]);
                    int v2 = Math.abs(arr[j] - arr[k]);
                    int v3 = Math.abs(arr[k] - arr[i]);

                    if(v1 <= a && v2 <= b && v3 <= c)
                        ans++;
                }
            }
        }
        return ans;
    }
}