class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int j = 0;
        int happy = 0;
        for(int i = 0; i < g.length; i++){
            while(j < s.length && s[j] < g[i]){
                j++;
            }
            if(j >= s.length)
                break; //no more cookiee remai
            happy++;
            j++;
        }
        return happy;
    }
}