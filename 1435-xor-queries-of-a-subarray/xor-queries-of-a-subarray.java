class Solution {
    int getXor(int[] arr , int lo, int hi){
        int num = arr[lo];
        for(int i = lo+1;i<=hi;i++){
            num ^= arr[i];
        }
        return num;
    }
    public int[] xorQueries(int[] arr, int[][] q) {
        int[] ans = new int[q.length];
        int ind = 0;
        for(int[] ele : q){
            ans[ind++] =  getXor(arr, ele[0],ele[1]);
        }
        return ans;
    }
}