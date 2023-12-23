class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visited=new HashSet<>();
        int x=0;
        int y=0;
        visited.add( x+ " : "+y);
        for(int i=0;i<path.length();i++){
            char c=path.charAt(i);
            if(c=='N') y++;
            if(c=='S') y--;
            if(c=='E') x++;
            if(c=='W') x--;

            String visit= x + " : " + y;

            if(visited.contains(visit)) return true;
            else visited.add(visit);
        }
        return false;
    }
}