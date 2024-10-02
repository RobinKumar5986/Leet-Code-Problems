class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length ; i++){
            int rem = arr[i] % k;
            if(rem < 0){
                rem += k;
            }
            arr[i] = rem;
            map.put(rem , map.getOrDefault(rem,0)+1);
        }
        int c = 0;

        for(int ele : arr){
            if(ele == 0){
                c++;
                continue;
            }
            int req = (k - ele);
            if(!map.containsKey(req))
                return false;
            map.put(req, map.get(req) - 1);
            if(map.get(req)==0)
                map.remove(req);
        }
        if(c % 2 != 0)
            return false;
        if((arr.length - c) % 2 != 0 )
            return false;
        return true;
    }
}