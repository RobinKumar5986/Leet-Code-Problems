class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Integer> val = new ArrayList<>(map.values());
        Collections.sort(val);
        if(k-1 < 0 || k-1 >= val.size())
            return "";
        int freq = val.get(k-1);
        if(freq > k )
            return "";
        for(String ele : arr){
            if(map.get(ele) <= freq){
                k--;
                if(k == 0 && map.get(ele) == freq)
                    return ele;
                else if(k==0 && map.get(ele) != freq)
                    return "";
            }
        }
        return "";
    }
}