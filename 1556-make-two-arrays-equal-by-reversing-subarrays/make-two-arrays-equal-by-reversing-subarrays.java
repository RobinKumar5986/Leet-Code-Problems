class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] map1 = new int[1000+1];
        int[] map2 = new int[1000+1];
        for(int i=0;i<arr.length;i++){
            map1[arr[i]]++;
            map2[target[i]]++;
        }
        return Arrays.equals(map1,map2);
    }
}