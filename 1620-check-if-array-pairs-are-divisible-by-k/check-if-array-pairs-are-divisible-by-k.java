class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int rem = arr[i] % k;
            if(rem < 0){
                rem += k;
            }
            arr[i] = rem;
            map.put(rem, map.getOrDefault(rem,0) + 1);
        }
        int ind = 0;
        int c = 0;
        Arrays.sort(arr);
        while(ind < arr.length  && arr[ind] == 0){
            ind++;
            c++;
        }
        if(c % 2 != 0)
            return false;
        if((arr.length - ind) % 2 != 0 )
            return false;
        int lo = ind;
        int hi = arr.length -1;
        while(lo < hi ){
            if(arr[lo] + arr[hi] != k)
                return false;
            lo++;
            hi--;
        }
        return true;
    }
}