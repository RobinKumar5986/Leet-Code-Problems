class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length < 3)
            return 0;
        int hi = 1;
        int ans = 0;
        int l = 0;
        int r = 0;
        while(hi < arr.length-1){
            if(arr[hi] > arr[hi-1] && arr[hi] > arr[hi+1]){
                l = hi-1;
                r = hi+1;
                while(l >= 0 && arr[l] < arr[l+1]){
                    l--;
                }
                l++;
                // System.out.println("Left: " +l);
                while(r < arr.length && arr[r-1] > arr[r]){
                    r++;
                }
                hi = r;
                r--;
                // System.out.println("Right: " +r);
                ans = Math.max(ans,r-l+1);
            }else{
                hi++;
            }
        }
        return ans;
    }
}