class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        int rank = 1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : clone){
            if(map.containsKey(ele)) continue; 
            map.put(ele,rank++);
        }
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}