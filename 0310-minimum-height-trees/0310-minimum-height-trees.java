class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edg) {
        
        List<Integer> ans=new ArrayList<>();
        if(n==1){
            ans.add(0);
            return ans;
        }
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int ct=0;
        for (int[] edge : edg) {
            int key = edge[0];
            int val = edge[1];
            if(!map.containsKey(key))
                map.put(key,new ArrayList<>());
            if(!map.containsKey(val))
                map.put(val,new ArrayList<>());
            map.get(key).add(val);
            map.get(val).add(key);
        }
        int[] dig=new int[n];
        for(int i=0;i<n;i++)
            dig[i]=map.get(i).size();

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(dig[i]==1)
                q.add(i);
        }
        while(!q.isEmpty()){
            int size=q.size();
            ans.clear();
            for(int i=0;i<size;i++){
                int node=q.remove();
                ans.add(node);
                List<Integer> lst=map.get(node);
                for(int ele : lst){
                    dig[ele]--;
                    if(dig[ele]==1){
                        System.out.println("ele : "+ele );
                        q.add(ele);
                    } 
                }
            }

        }
        return ans;
    }
}