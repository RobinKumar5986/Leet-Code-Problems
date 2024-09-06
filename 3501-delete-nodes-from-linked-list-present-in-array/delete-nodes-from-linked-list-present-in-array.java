class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max = 0;
        for(int ele : nums)
            max = Math.max(ele,max);
        boolean[] set = new boolean[max+1];
        for(int ele : nums)
            set[ele] = true;
        ListNode save = null;
        ListNode prev = null;
        while(head!=null){
            if(head.val >= set.length || set[head.val] == false){
                if(save == null){
                    save = head;
                    prev = head;
                }else{
                    prev.next = head;
                    prev = prev.next;
                }
            }
            head = head.next;
        }
        prev.next = null;
        return save;
    }
}