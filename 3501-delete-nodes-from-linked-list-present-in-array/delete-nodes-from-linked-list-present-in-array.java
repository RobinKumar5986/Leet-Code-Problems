class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        ListNode save = null;
        ListNode prev = null;
        while(head!=null){
            if(!set.contains(head.val)){
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