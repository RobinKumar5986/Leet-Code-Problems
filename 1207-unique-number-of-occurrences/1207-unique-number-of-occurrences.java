class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq=new int[2001];
        boolean[] used=new boolean[1001];
        for(int ele:arr){
                freq[ele + 1000]++;
        }
        for(int ele : freq){
            if(ele!=0 && !used[ele])
                used[ele]=true;
            else if(ele!=0 && used[ele])
                return false;
        }
        return true;
    }
}