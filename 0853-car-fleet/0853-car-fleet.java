class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<pos.length;i++)
            map.put(pos[i],speed[i]);

        Arrays.sort(pos);
        for(int i=0;i<pos.length;i++)
            speed[i]=map.get(pos[i]);

        int ans=1;
        float[] cur=new float[2];
        float time=(float)(target-pos[pos.length-1])/(float)speed[pos.length-1];

        cur[0]=pos[pos.length-1];
        cur[1]=time;

        for(int i=pos.length-1; i>=0 ;i--){
            time=(float)(target-pos[i])/(float)speed[i];
            if(time<=cur[1] && pos[i]<cur[0]){
                cur[0]=pos[i];
            }else if(time > cur[1] && pos[i]<cur[0]){
                ans++;
                cur[0]=pos[i];
                cur[1]=time;
            }
        }
        return ans;
    }
}