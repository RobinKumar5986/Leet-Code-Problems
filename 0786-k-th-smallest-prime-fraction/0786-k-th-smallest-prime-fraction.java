class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        if(arr.length==2) return arr;

        Map<Float,int[]> map=new HashMap<>();
        List<Float> mins=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                float fraction=(float)arr[i]/(float)arr[j];
                mins.add(fraction);
                map.put(fraction , new int[]{arr[i],arr[j]});
            }
        }
        Collections.sort(mins);
        float val=mins.get(k-1);

        return map.get(val);

    }
}