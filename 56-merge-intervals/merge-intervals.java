class Solution {
    public int[][] merge(int[][] inter) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int[] ele : inter){
            min = Math.min(ele[0], min);
            max = Math.max(ele[1],max);
        }
        int[] time = new int[max+1];
        boolean[] isCommon = new boolean[max+1];
        for(int[] ele : inter){
            if(ele[0] == ele[1]){
                isCommon[ele[0]] = true;
            }
            time[ele[0]]++;
            time[ele[1]]--;
        }
        Integer lo = null;
        int co = 0;
        List<int[]> lst = new ArrayList<>();
        for(int i = 0 ; i < time.length; i++){
            co += time[i];
            if(lo == null && co != 0){
                lo = i;
            }
            else if(lo != null && co == 0){
                lst.add(new int[]{lo,i});
                lo = null;
            }else if(co == 0 && isCommon[i]){
                lst.add(new int[]{i,i});
            }
        }
        return lst.toArray(new int[0][]);
    }
}