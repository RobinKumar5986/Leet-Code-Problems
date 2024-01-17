class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<arr.length;i++)
            freq.put(arr[i],freq.getOrDefault(arr[i],0) + 1);
        Set<Integer> set=new HashSet<>(freq.values());
        return set.size()==freq.size();
    }
}