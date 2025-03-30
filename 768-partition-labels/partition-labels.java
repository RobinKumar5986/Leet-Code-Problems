class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] max = new int[26];
        for(int i = 0; i<26; i++) max[i] = -1;
        for(int i = 0 ; i < s.length() ; i++){
            max[s.charAt(i) - 'a'] = i;
        }
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        int co = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int maxInd = max[s.charAt(i) - 'a'];
            set.add(maxInd);
            co++;
            if(maxInd <= i){
                set.remove(maxInd);
            }
            if(set.isEmpty()){
                ans.add(co);
                co = 0;
            }
        }
        return ans;
    }
}