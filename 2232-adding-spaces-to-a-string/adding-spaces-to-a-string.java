class Solution {
    public String addSpaces(String s, int[] spaces) {
        Set<Integer> inds = new HashSet<>();
        for(int ele : spaces)
            inds.add(ele);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            if(inds.contains(i)){
                sb.append(' ');
            }
            sb.append(s.charAt(i));
            
        }
        return sb.toString();
    }
}