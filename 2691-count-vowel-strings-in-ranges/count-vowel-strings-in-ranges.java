class Solution {
    public int[] vowelStrings(String[] w, int[][] q) {
        int[] pfx = new int[w.length];
        int[] ans = new int[q.length];
        Set<Character> set = Set.of('a','e','i','o','u');

        for(int i = 0 ; i < w.length ;i++){
            String s = w[i];
            char f = s.charAt(0);
            char l = s.charAt(s.length()-1);
            if(set.contains(f) && set.contains(l)){
                if(i == 0){
                    pfx[i] = 1;
                }else{
                    pfx[i] = pfx[i-1] + 1;
                }
            }else if(i!=0){
                pfx[i] = pfx[i-1];
            }
        }
        for(int i = 0 ; i < q.length ; i++){
            int lo = q[i][0];
            int hi = q[i][1];
            if( lo == 0){
                ans[i] = pfx[hi];
            }else{
                ans[i] = pfx[hi] - pfx[lo-1];
            }
        }
        return ans;
    }
}