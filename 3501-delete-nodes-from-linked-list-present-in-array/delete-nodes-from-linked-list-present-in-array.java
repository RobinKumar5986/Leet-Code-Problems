class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        boolean[] set = new boolean[100000+1];
        for(int ele : nums){
            set[ele] = true;
        }
        ListNode prev = null;
        ListNode ans = null;
        while(head != null){
            if(set[head.val]){
                while(head != null && set[head.val]){
                    head = head.next;
                }
            }
            if(prev == null){
                prev = head;
            }else{
                prev.next = head;
                prev = head;
            }
            if(head != null)
                head = head.next;
            if(ans == null)
                ans = prev;

        }
        return ans;
    }
}