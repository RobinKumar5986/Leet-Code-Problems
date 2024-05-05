class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        Map<String,Integer> map=new HashMap<>();
        int max=-1;
        for(int i=0;i<word.length();i+=k){
            String s=word.substring(i,i+k);
            map.put(s,map.getOrDefault(s,0)+1);
            max=Math.max(max,map.get(s));
        }
        return word.length()/k  - max;
    }
}