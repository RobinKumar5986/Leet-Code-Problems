class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int ele: arr){
            set.add(ele);
        }
        int rank = 1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : set){
            map.put(ele,rank++);
        }
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}