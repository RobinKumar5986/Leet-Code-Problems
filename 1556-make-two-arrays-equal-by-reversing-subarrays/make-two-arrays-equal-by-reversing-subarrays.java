class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer,Integer> mapT = new HashMap<>();
        Map<Integer,Integer> mapA = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            mapT.put(target[i],mapT.getOrDefault(target[i],0)+1);
            mapA.put(arr[i],mapA.getOrDefault(arr[i],0)+1);
        }
        if(mapA.size() != mapT.size())
            return false;
        for(int key : mapA.keySet()){
            if(mapT.get(key)!=mapA.get(key))
                return false;
        }
        return true;
    }
}