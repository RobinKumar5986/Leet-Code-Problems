class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> ans = new ArrayList<>();
        Arrays.sort(folder);
        Set<String> set = new HashSet<>();
        for(String ele : folder){
            String[] fol = ele.split("/");
            String s = "/";
            boolean flag = false;
            for(int i = 1 ; i < fol.length; i++){
                s = s + fol[i];
                if(set.contains(s)){
                    flag = true;
                    break;
                }
                if( i != fol.length - 1){
                    s = s + '/';
                }
            }
            if(!flag){
                set.add(s);
                ans.add(ele);
            }
        }
        return ans;
    }
}