class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] map1 = new int[1000+1];
        int[] map2 = new int[1000+1];
        for(int i=0;i<arr.length;i++){
            map1[arr[i]]++;
            map2[target[i]]++;
        }
        for(int i=0; i<1000 ;i++){
            if(map1[i]!=map2[i])
                return false;
        }
        return true;
    }
}