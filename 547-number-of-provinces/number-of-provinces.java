class Solution {
    void expand(int city, boolean[] vis, int[][] con,int n){
        vis[city] = true;
        for(int nextCity = 0; nextCity < n; nextCity++){
            if(con[city][nextCity] == 0)//no path
                continue;
            if(vis[nextCity])//already visted next city
                continue;
            expand(nextCity,vis,con,n);
        }
    }
    public int findCircleNum(int[][] con) {
        int n = con.length;
        boolean[] vis = new boolean[n];
        int ans = 0;

        for(int city = 0; city < n; city++){
            if(vis[city])//already visted this city
                continue;
            ans++;
            expand(city,vis,con,n);
        }
        return ans;
    }
}