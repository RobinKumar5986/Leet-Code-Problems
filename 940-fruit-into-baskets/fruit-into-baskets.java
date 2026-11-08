class Solution {
    public int totalFruit(int[] fr) {
        int[] type = new int[2];
        Arrays.fill(type,-1);
        int[] freq = new int[2];

        int lo = 0;
        int hi = 0;
        int ans = 0;
        while(hi < fr.length) {

            if(fr[hi] == type[0] || fr[hi] == type[1]){
                if(fr[hi] == type[0]){
                    freq[0]++;
                }else{
                    freq[1]++;
                }
                ans = Math.max(freq[0] + freq[1], ans);
            }
            else if(freq[0] == 0 || freq[1] == 0){
                if(freq[0] == 0){
                    type[0] = fr[hi];
                    freq[0]++;
                }else{
                    type[1] = fr[hi];
                    freq[1]++;
                }
                ans = Math.max(freq[0] + freq[1], ans);
            } else{
                //need to make minium one bucket empty
                while(freq[0] != 0 && freq[1] != 0){
                    int tp = fr[lo];
                    if(tp == type[0]){
                        freq[0]--;
                    }else{
                        freq[1]--;
                    }
                    lo++;
                }
                if(freq[0] == 0){
                    type[0] = fr[hi];
                    freq[0]++;
                }else{
                    type[1] = fr[hi];
                    freq[1]++;
                }
                ans = Math.max(freq[0] + freq[1], ans);
            }
            hi++;
        }
        return ans;
    }
}