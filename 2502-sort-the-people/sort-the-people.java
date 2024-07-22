class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        Map<Integer,String> map = new HashMap<>();
        for(int i=0;i<n.length;i++){
            map.put(h[i],n[i]);
        }
        Arrays.sort(h);
        int ind=0;
        for(int i=n.length-1;i>=0;i--){
            n[ind++]=map.get(h[i]);
        }
        return n;
    }
}