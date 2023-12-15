class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map=new HashMap<>();
        for(List<String> p : paths){
           String source=p.get(0);
           String dest=p.get(1);
           map.put(source,dest);
        }
        for(List<String> p : paths){
           String dest=p.get(1);
           if(!map.containsKey(dest)){
               return dest;
           }
        }
        return "";
    }
}