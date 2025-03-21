class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> supp = new HashSet<>();
        for(String ele : supplies){
            supp.add(ele);
        }
        Set<String> ans = new HashSet<>();
        for(int k = 0 ; k < recipes.length; k++){
            for(int i = 0 ; i < recipes.length ; i++){
                if(ans.contains(recipes[i]))
                    continue;
                boolean flag = true;
                for(String ele : ingredients.get(i)){
                    if(!supp.contains(ele)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    ans.add(recipes[i]);
                    supp.add(recipes[i]);
                }
            }
        }
       
        return new ArrayList<>(ans);
    }
}