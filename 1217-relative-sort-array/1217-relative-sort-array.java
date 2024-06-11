class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] map=new int[1001];
        for(int ele : arr1){
            map[ele]++;
        }
        int ind=0;
        for(int ele : arr2){
            int freq=map[ele];
            map[ele]=0;
            for(int i=0;i<freq;i++){
                arr1[ind++]=ele;
            }
        }
        for(int i=0;i<map.length;i++){
            if(map[i]==0)
                continue;
            for(int j=0;j<map[i];j++)
                arr1[ind++]=i;
        }
        return arr1;
    }
}