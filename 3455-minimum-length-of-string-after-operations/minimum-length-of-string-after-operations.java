class Solution {
    int ans = 0;
    public int minimumLength(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c) == 3)
                map.put(c,1);
        }
        map.forEach((key, val) -> {
            ans+=val;
        });
        return ans;
    }
}