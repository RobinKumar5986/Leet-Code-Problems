class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sort = arr.clone();
        Arrays.sort(sort);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int ele : sort){
            if(map.containsKey(ele))
                continue;
            map.put(ele,rank++);
        }
        int[] ans = new int[arr.length];
        int i = 0;
        for(int ele : arr){
            ans[i++] = map.get(ele); 
        }
        return ans;
    }
}