class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<pos.length;i++)
            map.put(pos[i],speed[i]);

        Arrays.sort(pos);
        for(int i=0;i<pos.length;i++)
            speed[i]=map.get(pos[i]);

        int ans=1;
        float prev=(float)(target-pos[pos.length-1])/(float)speed[pos.length-1];
        for(int i=pos.length-1; i>=0 ;i--){
            float time=(float)(target-pos[i])/(float)speed[i];
            if(time > prev){
                ans++;
                prev=time;
            }
        }
        return ans;
    }
}