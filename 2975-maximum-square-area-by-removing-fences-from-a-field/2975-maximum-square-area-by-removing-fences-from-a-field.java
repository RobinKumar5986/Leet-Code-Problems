class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        int[] hF=new int[hFences.length + 2];
        int[] vF=new int[vFences.length + 2];
        hF[0]=1;
        vF[0]=1;
    
        for(int i=1;i<hF.length-1;i++){
            hF[i]=hFences[i-1];
        }
        for(int i=1;i<vF.length-1;i++){
            vF[i]=vFences[i-1];
        }
        hF[hF.length-1]=m;
        vF[vF.length-1]=n;
        Arrays.sort(hF);
        Arrays.sort(vF);
        Set<Integer> s1=new HashSet<>();

        for(int i=0;i<hF.length;i++){
            for(int j=i+1;j<hF.length;j++){
                int len=hF[j]-hF[i];
                s1.add(len);
            }
        }
        int area=-1;
        for(int i=0;i<vF.length;i++){
            for(int j=i+1;j<vF.length;j++){
                int temp=vF[j]-vF[i];
                if(s1.contains(temp))
                    area=Math.max(area,temp);
            }
        }
    
        if(area==-1)return -1;
        int mod = 1000000007;
        return (int) ((1L * area * area) % mod);
        
    }
}