class Solution {
    public String repeatLimitedString(String s, int rL) {
        int[] map = new int[26];
        for(char c : s.toCharArray())
            map[c - 'a']++;
        StringBuilder sb = new StringBuilder();

        for(int i = 25; i >= 0 ; i--){
            if(map[i] != 0){
                if(map[i] <= rL){
                    for(int j = 0 ; j< map[i] ; j++){
                        sb.append((char) (i + 'a'));
                    }
                    map[i] = 0;
                }else{
                    for(int j = 0 ; j<rL ; j++){
                        sb.append((char) (i + 'a'));
                    }
                    map[i] -= rL;
                    boolean found = false;
                    for(int j = i-1; j >= 0 ; j--){
                        if(map[j] != 0){
                            sb.append((char) (j + 'a'));
                            map[j]-=1;
                            found = true;
                            break;
                        }
                        
                    }
                    if(!found)
                        break;
                    i++;
                }
                
            }
        }
        return sb.toString();
    }
}