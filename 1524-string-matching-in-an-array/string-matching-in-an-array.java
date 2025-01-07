class Solution {
    boolean checker(String sub , String main){
        if(sub.length() > main.length()){
            return false;
        }
        int ind = 0;
        for(int i = 0 ; i < main.length(); i++){
            if(sub.charAt(ind) == main.charAt(i)){
                for(int j = i; j<main.length();j++){
                    if(ind < sub.length() && sub.charAt(ind) == main.charAt(j)){
                        ind++;
                        if(ind == sub.length())
                            return true;
                    }else{
                        break;
                    }
                }
            }
            ind = 0;
        }
        return false;
    }
    public List<String> stringMatching(String[] words) {
        Set<String> seen = new HashSet<>();
        List<String> ans = new ArrayList<>();
        for(int i  = 0 ; i < words.length ; i++){
            for(int j = 0; j < words.length; j++){
                if(i != j && !seen.contains(words[i]) && checker(words[i],words[j])){
                    ans.add(words[i]);
                    seen.add(words[i]);
                    break;
                }
            }
            seen.add(words[i]);
        }
        return ans;
    }
}