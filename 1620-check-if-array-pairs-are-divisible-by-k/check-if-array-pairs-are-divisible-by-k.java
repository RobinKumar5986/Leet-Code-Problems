class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for(int i = 0;i<arr.length;i++){
            int rem = arr[i] % k;
            if(rem < 0)
                rem += k;
            arr[i] = rem;
            freq[rem]++;
        }
        int c = 0;
        for(int ele : arr){
            if(ele == 0){
                c++;
                continue;
            }
            int req = (k - ele) ;
            if(freq[req] <= 0)
                return false;
            freq[req]--; 
        }
        if(c % 2 != 0)
            return false;
        return true;
    }
}