class Solution {
    public int numRescueBoats(int[] people, int lim) {
        Arrays.sort(people);
        int lo=0;
        int hi=people.length-1;
        int ans=0;
        while(lo<=hi){
            int sum=people[lo]+people[hi];
            if(sum<=lim){
                lo++;
                hi--;
                ans++;
            }else{
                hi--;
                ans++;
            }
        }
        return ans;
    }
}