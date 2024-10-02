class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for(int ele : arr){
            int rem = ele % k;
            if(rem < 0)
                rem += k;
            freq[rem]++;
        }
        if(freq[0]%2 != 0 )
            return false;
        for(int i = 1 ;i<freq.length ; i++)
            if(freq[i] != freq[k - i])
                return false;
        return true;
    }
}