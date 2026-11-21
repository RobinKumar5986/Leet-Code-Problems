class Solution {
    public int leastInterval(char[] tasks, int n) {
        int rem = tasks.length;
        int time = 0;
        int[] map = new int[26];
        int[] finish = new int[26];

        for(char c : tasks)map[c-'A']++;

        while(rem > 0){
            int process = -1;
            int max = -1;
            //finding the best process to add
            for(int i = 0 ; i < 26; i++){
                if(map[i] > 0 && finish[i] <= time){
                    if(map[i] > max) {
                        process = i;
                        max = map[i];
                    }
                }
            }
            if( process != -1) {
                map[process]--;
                finish[process] = time + n + 1;
                rem--;
            }
            time++;
        }
        return time;
    }
}