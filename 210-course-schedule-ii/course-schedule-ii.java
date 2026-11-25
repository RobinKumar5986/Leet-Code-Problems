class Solution {
    public int[] findOrder(int nc, int[][] req) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0;i < nc;i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[nc];
        //creating the graph i.e b -> a i.e child -> parent 

        for(int[] ele : req){
            int a = ele[0];
            int b = ele[1];

            graph.get(b).add(a);
            indegree[a]++;
        }
        int[] ans = new int[nc];
        int ind = 0;

        Stack<Integer> stk = new Stack<>();

        for(int i = 0 ; i < nc;i++){
            if(indegree[i] == 0){
                stk.push(i);
            }
        }
        while(!stk.isEmpty()){
            int rem = stk.pop();
            ans[ind++] = rem;
            for(int ele : graph.get(rem)){
                indegree[ele]--;
                if(indegree[ele] == 0){
                    stk.push(ele);
                }
            }
        }

        if(ind != nc) return new int[0];
        return ans;
    }
}