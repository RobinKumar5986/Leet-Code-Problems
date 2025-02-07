class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> color = new HashMap<>();
        HashMap<Integer,Integer> dis = new HashMap<>();
        int[] ans = new int[queries.length];
        int ind = 0;

        for(int[] qr : queries){
            int key = qr[0];
            int val = qr[1];
            Integer cur = null;
            if(color.containsKey(key))
                cur = color.get(key);
            if(cur != null){
                if(dis.get(cur) == 1){
                    dis.remove(cur);
                }else{
                    dis.put(cur,dis.get(cur)-1);
                }
            }
            color.put(key,val);
            dis.put(val,dis.getOrDefault(val,0)+1);
            ans[ind++] = dis.size();
        }
        return ans;
    }
}