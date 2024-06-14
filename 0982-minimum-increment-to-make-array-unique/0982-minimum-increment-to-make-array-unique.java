class Solution {
    public int minIncrementForUnique(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();
        List<Integer> rep=new ArrayList<>();
        for(int ele : nums){
            if(ele>max)
                max=ele;
            if(ele<min)
                min=ele;
            if(set.contains(ele))
                rep.add(ele);
            set.add(ele);
        }
        //finding the empty spaces in the range min - max;
        TreeSet<Integer> emp=new TreeSet<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i))
                emp.add(i);
        }
        Collections.sort(rep); //makes this Algo O(n log(n))
        int ans=0;
        while(!rep.isEmpty() && !emp.isEmpty()){
            int r=rep.get(0);
            int e=emp.pollFirst();
            if(e>r){
                ans+=e-r;
                rep.remove(0);
            }
        }
        int c=1;
        while(!rep.isEmpty()){
            ans+=max-rep.remove(0)+c;
            c++;
        }
        return ans;
    }
}