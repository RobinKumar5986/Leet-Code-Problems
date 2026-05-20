class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] m1 = new int[A.length+1];
        int[] m2 = new int[A.length+1];

        int ans[] = new int[A.length];
        int co = 0;
        // the good thing about this question is the nubers wont repeat
        for(int i = 0; i<A.length;i++){
            m1[A[i]]++;
            m2[B[i]]++;
            if(A[i] == B[i]){
                co += m1[B[i]];
            }else{
                co += m1[B[i]];
                co += m2[A[i]];
            }
            ans[i] = co;
        } 
        return ans;
    }
}