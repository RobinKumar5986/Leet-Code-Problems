class Solution {
    public int maximumLength(String s) {
        int ans = -1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if(s.charAt(i) != s.charAt(j))
                    break;
                sb.append(s.charAt(i));

                String key = sb.toString();
                map.put(key, map.getOrDefault(key, 0) + 1);
                
                if (map.get(key) >= 3 && ans < key.length()) {
                    System.out.println(key); 
                    ans = key.length();
                }
            }
        }
        return ans;
    }
}
