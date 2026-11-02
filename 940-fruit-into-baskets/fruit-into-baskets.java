class Solution {
    public int totalFruit(int[] fr) {
        int[] type = new int[2];
        Arrays.fill(type,-1);
        int c1 = 0;
        int c2 = 0;
        int lo = 0;
        int hi = 0;
        int ans = 0;
        while(lo <= hi && hi < fr.length) {
            if(type[0] != -1 && type[1] != -1){
                if(fr[hi] != type[0] && fr[hi] != type[1]){
                    //dumping all the values of type 0
                    while(c1 > 0 && c2 > 0){
                        if(fr[lo] == type[0])
                            c1--;
                        else
                            c2--;
                        lo++;
                    }
                    if(c1 == 0) {
                        type[0] = fr[hi];
                        c1++;
                    }else{
                        type[1] = fr[hi];
                        c2++;
                    }
                }else{
                    if(fr[hi] == type[0])
                        c1++;
                    else
                        c2++;
                }
            }else{
                if(fr[hi] == type[0]){
                    c1++;
                }else if(fr[hi] == type[1]){
                    c2++;
                }else{
                    if(c1 == 0){
                        type[0] = fr[hi];
                        c1++;
                    }else{
                        type[1] = fr[hi];
                        c2++;
                    }
                }

            }
            ans = Math.max(c1 + c2, ans);
            hi++;
        }
        return ans;
        
    }
}