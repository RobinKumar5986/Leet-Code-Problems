class Solution {
    public int carFleet(int tar, int[] po, int[] sp) {
        if(tar == 0 )
            return 0;
        int cf = 1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;  i < po.length; i++){
            map.put(po[i], sp[i]);
        }
        Arrays.sort(po);
        double maxT = -99;
        for(int i = po.length-1; i >= 0 ; i--){
            double time = (double)( tar - po[i])/ (double)(map.get(po[i]));
            if(maxT == -99){
                maxT = time;
                continue;
            }
            if(time > maxT){
                cf++;
                maxT = time;
            }
        }
        return cf;
    }
}