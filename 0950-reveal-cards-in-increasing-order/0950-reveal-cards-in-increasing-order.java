class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] ans=new int[deck.length];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<deck.length;i++)
            q.add(i);
        int i=0;
        while(!q.isEmpty()){
            int ind=q.remove();
            ans[ind]=deck[i++];
            if(!q.isEmpty())
                q.add(q.remove());
        }
        return ans;
    }
}