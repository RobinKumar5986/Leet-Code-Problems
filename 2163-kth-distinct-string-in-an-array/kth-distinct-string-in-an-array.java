class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int count =0;
        for(String ele: arr){
            if(map.get(ele)==1){
                count++;
                if(count==k){
                    return ele;
                }
            }
        }
        return "";
    }
}