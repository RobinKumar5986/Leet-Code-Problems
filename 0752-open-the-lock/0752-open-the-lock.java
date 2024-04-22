class Solution {
    
    char turnUp(char c){
        return c=='0'?'9' : (char)(c-1); 
    }
    char turnDown(char c){
        return c=='9'?'0':(char)(c+1);
    }
    String[] allTurn(String s){
        String[] moves=new String[8];
        int ind=0;
        for(int i=0;i<4;i++){
            char c=s.charAt(i);
            char up=turnUp(c);
            char down=turnDown(c);
            char[] arr=s.toCharArray();
            arr[i]=down;
            moves[ind++]=new String(arr);
            arr[i]=up;
            moves[ind++]=new String(arr);
        }
        return moves;
    }


    HashSet<String> lock=new HashSet<>();
    int bfs(String target){
        Queue<String> q=new LinkedList<>();
        q.add("0000");
        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String st=q.remove();
                String[] pass=allTurn(st);
                for(int j=0;j<8;j++)
                {
                    if(pass[j].equals(target))
                        return level;
                    if(!lock.contains(pass[j])){
                        lock.add(pass[j]);
                        q.add(pass[j]);
                    }
                }
                System.out.println();
            }
            level++;
        }
        return -1;
    }
    public int openLock(String[] deadends, String target) {
        for(String ele : deadends)
            lock.add(ele);
        if(lock.contains("0000"))
            return -1;
        if(target.equals("0000"))
            return 0;
        return bfs(target);
    }
}